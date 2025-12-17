package tech.stabnashiamunashe.omni.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.stabnashiamunashe.omni.dtos.CreateUserRequest;
import tech.stabnashiamunashe.omni.models.User;
import tech.stabnashiamunashe.omni.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(CreateUserRequest createUserRequest) {
        return userRepository.save(
                User.builder()
                        .address(createUserRequest.address())
                        .firstName(createUserRequest.firstName())
                        .email(createUserRequest.email())
                        .address(createUserRequest.address())
                        .password(
                                //Encode Password
                                createUserRequest.password()
                        )
                        .build()
        );

    }


    public List<User> createUsers(List<CreateUserRequest> createUserRequests) {
        List<User> users = new ArrayList<>();
        for (CreateUserRequest createUserRequest: createUserRequests ){
            users.add(userRepository.save(
                    User.builder()
                            .address(createUserRequest.address())
                            .firstName(createUserRequest.firstName())
                            .email(createUserRequest.email())
                            .address(createUserRequest.address())
                            .password(
                                    //Encode Password
                                    createUserRequest.password()
                            )
                            .build()
            ));
        }
        return users;

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public Map<String, String> deleteUserById(Long id) {
        userRepository.deleteById(id);
        return Map.of("status", "deleted");
    }
}

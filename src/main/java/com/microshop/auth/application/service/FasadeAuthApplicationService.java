package com.microshop.auth.application.service;

import com.microshop.auth.application.service.usecases.*;
import org.springframework.stereotype.Component;

@Component
public class FasadeAuthApplicationService {

    private CreateUserUseCase createUserUseCase;
    private DeleteUserUseCase deleteUserUseCase;
    private LoginUserUseCase loginUserUseCase;
    private UpdateTokenUseCase updateTokenUseCase;
    private UpdateUserUseCase updateUserUseCase;


}

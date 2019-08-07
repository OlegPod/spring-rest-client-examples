package com.olehpodolin.springrestclientexamples.services;

import com.olehpodolin.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}

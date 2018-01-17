package com.bank.profile;

import org.springframework.data.repository.CrudRepository;

import com.bank.profile.Profile;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}

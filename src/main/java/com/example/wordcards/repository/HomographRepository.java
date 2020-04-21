package com.example.wordcards.repository;

import com.example.wordcards.domain.Homograph;
import org.apache.catalina.startup.CredentialHandlerRuleSet;
import org.springframework.data.repository.CrudRepository;

public interface HomographRepository extends CrudRepository<Homograph, Integer> {

}

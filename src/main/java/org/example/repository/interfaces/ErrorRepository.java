package org.example.repository.interfaces;

import org.example.exception.MyException;
import org.example.generic.GenericRepository;

public interface ErrorRepository extends GenericRepository<MyException> {
}

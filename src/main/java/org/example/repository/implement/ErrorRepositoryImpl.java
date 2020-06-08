package org.example.repository.implement;

import org.example.exception.MyException;
import org.example.generic.AbstractGenericRepository;
import org.example.repository.interfaces.ErrorRepository;

public class ErrorRepositoryImpl extends AbstractGenericRepository<MyException> implements ErrorRepository {
}

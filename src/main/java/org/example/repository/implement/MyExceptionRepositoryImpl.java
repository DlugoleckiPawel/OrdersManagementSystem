package org.example.repository.implement;

import org.example.exception.MyException;
import org.example.generic.AbstractGenericRepository;
import org.example.repository.interfaces.ExceptionRepository;

public class MyExceptionRepositoryImpl extends AbstractGenericRepository<MyException>
    implements ExceptionRepository {
}

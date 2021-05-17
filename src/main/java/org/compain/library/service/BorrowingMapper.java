package org.compain.library.service;

import org.compain.library.model.Borrowing;
import org.compain.library.service.DTO.BorrowingDTO;

public class BorrowingMapper {

    public static BorrowingDTO toDTO(Borrowing borrowing){
        BorrowingDTO borrowingDTO = new BorrowingDTO();
        borrowingDTO.setBorrowingDate(borrowing.getBorrowingDate());
        borrowingDTO.setUserDto(UserMapper.toDTO(borrowing.getUser()));
        borrowingDTO.setCopyDto(CopyMapper.toDTO(borrowing.getCopy()));
        borrowingDTO.setRenewal(borrowing.getRenewal());
        borrowingDTO.setReturned(borrowing.getReturned());
        borrowingDTO.setIdBorrowing(borrowing.getIdBorrowing());
        borrowingDTO.setBorrowingLimitDate(borrowing.getBorrowingLimitDate());
        return borrowingDTO;
    }

    public static Borrowing toEntity(BorrowingDTO borrowingDTO){
        Borrowing borrowing = new Borrowing();
        borrowing.setBorrowingDate(borrowingDTO.getBorrowingDate());
        borrowing.setUser(UserMapper.toEntity(borrowingDTO.getUserDto()));
        borrowing.setCopy(CopyMapper.toEntity(borrowingDTO.getCopyDto()));
        borrowing.setRenewal(borrowingDTO.getRenewal());
        borrowing.setReturned(borrowingDTO.getReturned());
        borrowing.setIdBorrowing(borrowingDTO.getIdBorrowing());
        borrowing.setBorrowingLimitDate(borrowingDTO.getBorrowingLimitDate());
        return borrowing;
    }

    public static Borrowing patch(BorrowingDTO borrowingDTO, Borrowing borrowing){
        if(borrowingDTO.getRenewal() != null) {
            borrowing.setRenewal(borrowingDTO.getRenewal());
        }
        if(borrowingDTO.getBorrowingDate() != null) {
            borrowing.setBorrowingDate(borrowingDTO.getBorrowingDate());
        }
        if(borrowingDTO.getReturned() != null) {
            borrowing.setReturned(borrowingDTO.getReturned());
        }
        if(borrowingDTO.getBorrowingLimitDate() != null) {
            borrowing.setBorrowingLimitDate(borrowingDTO.getBorrowingLimitDate());
        }
        return  borrowing;
    }
}
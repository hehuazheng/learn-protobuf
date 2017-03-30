package com.hzz;

import com.google.protobuf.InvalidProtocolBufferException;

public class UserProtoDemo {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        UserProto.User proto = UserProto.User.newBuilder().addAddress("pjs").setID(1).setUserName("hzz").setPassword("hzz").build();
        // serialize
        byte[] barr = proto.toByteArray();
        // deserialize
        UserProto.User user2 = UserProto.User.parseFrom(barr);
        System.out.println(user2.getUserName());
    }
}

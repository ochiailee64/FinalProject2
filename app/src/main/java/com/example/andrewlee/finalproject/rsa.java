package com.example.andrewlee.finalproject;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;


/**
 * Created by andrewlee on 4/23/17.
 */



    public class rsa{
        public static void main(){
            KeyPairGenerator kpg = null;
            try {
                kpg = KeyPairGenerator.getInstance("RSA");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            kpg.initialize(2048);
            KeyPair kp = kpg.genKeyPair();
            Key publicKey = kp.getPublic();
            Key privateKey = kp.getPrivate();

            KeyFactory fact = null;
            try {
                fact = KeyFactory.getInstance("RSA");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            RSAPublicKeySpec pub = null;
            try {
                 pub = fact.getKeySpec(publicKey, RSAPublicKeySpec.class);
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
            }

            RSAPrivateKeySpec priv = null;
            try {
                 priv = fact.getKeySpec(privateKey, RSAPrivateKeySpec.class);
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
            }


        }






}
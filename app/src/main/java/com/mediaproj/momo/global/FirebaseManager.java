package com.mediaproj.momo.global;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseManager {
    private static FirebaseManager instance = new FirebaseManager();
    public FirebaseFirestore db;
    public CollectionReference roomsRef;

    private FirebaseManager() {
        db = FirebaseFirestore.getInstance();
        roomsRef = db.collection("rooms");
    }

    public static FirebaseManager getInstance() {
        return instance;
    }
}
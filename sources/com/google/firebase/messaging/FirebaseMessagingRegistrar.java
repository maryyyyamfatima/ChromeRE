package com.google.firebase.messaging;

import defpackage.AbstractC4246cX3;
import defpackage.AbstractC6261iO0;
import defpackage.AbstractC8122no;
import defpackage.C11535xl0;
import defpackage.C11739yL2;
import defpackage.H44;
import defpackage.InterfaceC0464Do3;
import defpackage.InterfaceC11752yO0;
import defpackage.InterfaceC12095zO0;
import defpackage.InterfaceC9950t71;
import defpackage.SZ;
import defpackage.VZ;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar {
    public List getComponents() {
        VZ[] vzArr = new VZ[2];
        SZ sz = new SZ(FirebaseMessaging.class, new Class[0]);
        sz.a(new C11535xl0(1, 0, AbstractC6261iO0.class));
        sz.a(new C11535xl0(0, 0, InterfaceC12095zO0.class));
        sz.a(new C11535xl0(0, 1, H44.class));
        sz.a(new C11535xl0(0, 1, InterfaceC9950t71.class));
        sz.a(new C11535xl0(0, 0, AbstractC4246cX3.class));
        sz.a(new C11535xl0(1, 0, InterfaceC11752yO0.class));
        sz.a(new C11535xl0(1, 0, InterfaceC0464Do3.class));
        sz.e = new C11739yL2();
        if (!(sz.c == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        sz.c = 1;
        vzArr[0] = sz.b();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(AbstractC8122no.class);
        Collections.addAll(hashSet, new Class[0]);
        vzArr[1] = new VZ(new HashSet(hashSet), new HashSet(hashSet2), 0, 1, hashSet3);
        return Arrays.asList(vzArr);
    }
}

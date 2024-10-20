package com.google.firebase.iid;

import defpackage.AbstractC6261iO0;
import defpackage.AbstractC8122no;
import defpackage.C11535xl0;
import defpackage.C11739yL2;
import defpackage.H44;
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
public final class Registrar {
    public List getComponents() {
        SZ sz = new SZ(FirebaseInstanceId.class, new Class[0]);
        sz.a(new C11535xl0(1, 0, AbstractC6261iO0.class));
        sz.a(new C11535xl0(0, 1, H44.class));
        sz.a(new C11535xl0(0, 1, InterfaceC9950t71.class));
        sz.a(new C11535xl0(1, 0, InterfaceC11752yO0.class));
        sz.e = new C11739yL2();
        if (!(sz.c == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        sz.c = 1;
        VZ b = sz.b();
        Class[] clsArr = new Class[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(InterfaceC12095zO0.class);
        for (Class cls : clsArr) {
            if (cls == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, clsArr);
        C11535xl0 c11535xl0 = new C11535xl0(1, 0, FirebaseInstanceId.class);
        if (!(!hashSet.contains(c11535xl0.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(c11535xl0);
        VZ vz = new VZ(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, hashSet3);
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(AbstractC8122no.class);
        Collections.addAll(hashSet4, new Class[0]);
        return Arrays.asList(b, vz, new VZ(new HashSet(hashSet4), new HashSet(hashSet5), 0, 1, hashSet6));
    }
}

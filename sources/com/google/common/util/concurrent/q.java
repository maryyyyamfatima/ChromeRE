package com.google.common.util.concurrent;

import defpackage.S7;
import defpackage.T7;
import defpackage.U7;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class q extends j {
    public static final S7 j;
    private volatile int remaining;
    private volatile Set seenExceptions = null;

    public abstract void A(Set set);

    public static /* synthetic */ int z(q qVar) {
        int i = qVar.remaining - 1;
        qVar.remaining = i;
        return i;
    }

    static {
        S7 u7;
        try {
            u7 = new T7(AtomicReferenceFieldUpdater.newUpdater(q.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(q.class, "remaining"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            u7 = new U7();
        }
        j = u7;
        if (e == null) {
            return;
        }
        Level level = Level.SEVERE;
        throw null;
    }

    public q(int i) {
        this.remaining = i;
    }

    public final Set C() {
        Set set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        A(newSetFromMap);
        j.a((p) this, newSetFromMap);
        Set set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final void B() {
        this.seenExceptions = null;
    }
}

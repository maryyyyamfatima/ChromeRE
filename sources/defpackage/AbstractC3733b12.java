package defpackage;

import android.os.ConditionVariable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3733b12 {
    public static final ConditionVariable a = new ConditionVariable();
    public static final Map b = Collections.synchronizedMap(new HashMap());
    public static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public static volatile InterfaceC8940qA1 e;

    static {
        new AtomicInteger();
        e = new InterfaceC8940qA1() { // from class: a12
            @Override // defpackage.InterfaceC8940qA1
            public final void a(String str) {
                System.loadLibrary(str);
            }
        };
    }

    public static void a(InterfaceC8940qA1 interfaceC8940qA1, String str) {
        boolean z;
        Map map = b;
        synchronized (map) {
            ConditionVariable conditionVariable = (ConditionVariable) map.get(str);
            ConditionVariable conditionVariable2 = a;
            if (conditionVariable == conditionVariable2) {
                return;
            }
            if (conditionVariable != null) {
                z = true;
            } else {
                conditionVariable = new ConditionVariable();
                map.put(str, conditionVariable);
                z = false;
            }
            if (!z) {
                synchronized (conditionVariable) {
                    try {
                        long nanoTime = System.nanoTime();
                        interfaceC8940qA1.a(str);
                        map.put(str, conditionVariable2);
                        c.add(new C8776pi2(str, Long.valueOf(System.nanoTime() - nanoTime)));
                    } finally {
                    }
                }
            }
            if (Thread.holdsLock(conditionVariable)) {
                return;
            }
            conditionVariable.block();
        }
    }
}

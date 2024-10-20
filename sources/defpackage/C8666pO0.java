package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pO0 */
/* loaded from: classes.dex */
public final class C8666pO0 {
    public static WeakReference b;
    public final ExecutorC8323oO0 a;

    public static synchronized C8666pO0 a(Context context) {
        C8666pO0 c8666pO0;
        synchronized (C8666pO0.class) {
            WeakReference weakReference = b;
            c8666pO0 = weakReference == null ? null : (C8666pO0) weakReference.get();
            if (c8666pO0 == null) {
                c8666pO0 = new C8666pO0(context.getApplicationContext());
                b = new WeakReference(c8666pO0);
            }
        }
        return c8666pO0;
    }

    public C8666pO0(Context context) {
        this.a = new ExecutorC8323oO0(new C6603jO0(context));
    }

    public final void c(InterfaceC4325cl1... interfaceC4325cl1Arr) {
        Thing[] thingArr;
        if (interfaceC4325cl1Arr == null) {
            thingArr = null;
        } else {
            try {
                Thing[] thingArr2 = new Thing[interfaceC4325cl1Arr.length];
                System.arraycopy(interfaceC4325cl1Arr, 0, thingArr2, 0, interfaceC4325cl1Arr.length);
                thingArr = thingArr2;
            } catch (ArrayStoreException unused) {
                new AF3().m(new C10380uO0("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
                return;
            }
        }
        if (thingArr == null) {
            new AF3().m(new C10380uO0("Indexables cannot be null."));
        } else {
            b(new MutateRequest(1, thingArr, null, null, null, null, null));
        }
    }

    public final AF3 b(MutateRequest mutateRequest) {
        boolean isEmpty;
        ExecutorC8323oO0 executorC8323oO0 = this.a;
        executorC8323oO0.getClass();
        C7979nO0 c7979nO0 = new C7979nO0(executorC8323oO0, mutateRequest);
        AF3 af3 = c7979nO0.b.a;
        af3.b(executorC8323oO0, executorC8323oO0);
        synchronized (executorC8323oO0.h) {
            isEmpty = executorC8323oO0.h.isEmpty();
            executorC8323oO0.h.add(c7979nO0);
        }
        if (isEmpty) {
            c7979nO0.a();
        }
        return af3;
    }
}

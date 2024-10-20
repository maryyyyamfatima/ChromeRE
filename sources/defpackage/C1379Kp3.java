package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.c;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379Kp3 extends c implements DA1 {
    public static final WeakHashMap e0 = new WeakHashMap();
    public final Map b0 = Collections.synchronizedMap(new C4317ck());
    public int c0 = 0;
    public Bundle d0;

    @Override // defpackage.DA1
    public final LifecycleCallback h(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.b0.get(str));
    }

    @Override // defpackage.DA1
    public final void c(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.b0;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.c0 > 0) {
                new HandlerC10413uU3(Looper.getMainLooper()).post(new RunnableC1249Jp3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AbstractC4199cO1.a("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // defpackage.DA1
    public final Activity j() {
        return getActivity();
    }

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        this.c0 = 1;
        this.d0 = bundle;
        for (Map.Entry entry : this.b0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        Iterator it = this.b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        for (Map.Entry entry : this.b0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.c
    public final void H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.H(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.c
    public final void t0() {
        this.f11484J = true;
        this.c0 = 2;
        Iterator it = this.b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        this.c0 = 3;
        Iterator it = this.b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // androidx.fragment.app.c
    public final void u0() {
        this.f11484J = true;
        this.c0 = 4;
        Iterator it = this.b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        this.c0 = 5;
        Iterator it = this.b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }
}

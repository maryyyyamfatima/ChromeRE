package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.h;
import com.bumptech.glide.a;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lO2 */
/* loaded from: classes.dex */
public final class C7293lO2 implements Handler.Callback {
    public static final C6605jO2 l = new C6605jO2();
    public volatile ComponentCallbacks2C5575gO2 a;
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final Handler i;
    public final InterfaceC6949kO2 j;
    public final InterfaceC11096wU0 k;

    public C7293lO2(InterfaceC6949kO2 interfaceC6949kO2, NZ0 nz0) {
        InterfaceC11096wU0 c11908yq0;
        new Bundle();
        this.j = interfaceC6949kO2 == null ? l : interfaceC6949kO2;
        this.i = new Handler(Looper.getMainLooper(), this);
        if (O51.h && O51.g) {
            if (nz0.a.containsKey(AbstractC11464xZ0.class)) {
                c11908yq0 = new KO0();
            } else {
                c11908yq0 = new NO0();
            }
        } else {
            c11908yq0 = new C11908yq0();
        }
        this.k = c11908yq0;
    }

    public final ComponentCallbacks2C5575gO2 c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC10296u74.a;
        boolean z = true;
        if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
            if (context instanceof VS0) {
                return b((VS0) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return c(activity.getApplicationContext());
                }
                if (activity instanceof VS0) {
                    return b((VS0) activity);
                }
                if (!activity.isDestroyed()) {
                    this.k.a(activity);
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    Activity a = a(activity);
                    if (a != null && a.isFinishing()) {
                        z = false;
                    }
                    FragmentC6263iO2 d = d(fragmentManager);
                    ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2 = d.i;
                    if (componentCallbacks2C5575gO2 != null) {
                        return componentCallbacks2C5575gO2;
                    }
                    ComponentCallbacks2C5575gO2 a2 = this.j.a(a.b(activity), d.a, d.g, activity);
                    if (z) {
                        a2.b();
                    }
                    d.i = a2;
                    return a2;
                }
                throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.j.a(a.b(context.getApplicationContext()), new C8436oj(), new C9967tA0(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    public final ComponentCallbacks2C5575gO2 b(VS0 vs0) {
        char[] cArr = AbstractC10296u74.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(vs0.getApplicationContext());
        }
        if (!vs0.isDestroyed()) {
            this.k.a(vs0);
            h h0 = vs0.h0();
            Activity a = a(vs0);
            boolean z = a == null || !a.isFinishing();
            C2288Rp3 e = e(h0);
            ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2 = e.f0;
            if (componentCallbacks2C5575gO2 == null) {
                componentCallbacks2C5575gO2 = this.j.a(a.b(vs0), e.b0, e.c0, vs0);
                if (z) {
                    componentCallbacks2C5575gO2.b();
                }
                e.f0 = componentCallbacks2C5575gO2;
            }
            return componentCallbacks2C5575gO2;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final FragmentC6263iO2 d(FragmentManager fragmentManager) {
        HashMap hashMap = this.g;
        FragmentC6263iO2 fragmentC6263iO2 = (FragmentC6263iO2) hashMap.get(fragmentManager);
        if (fragmentC6263iO2 != null) {
            return fragmentC6263iO2;
        }
        FragmentC6263iO2 fragmentC6263iO22 = (FragmentC6263iO2) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC6263iO22 == null) {
            fragmentC6263iO22 = new FragmentC6263iO2();
            fragmentC6263iO22.k = null;
            hashMap.put(fragmentManager, fragmentC6263iO22);
            fragmentManager.beginTransaction().add(fragmentC6263iO22, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.i.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC6263iO22;
    }

    public final C2288Rp3 e(h hVar) {
        HashMap hashMap = this.h;
        C2288Rp3 c2288Rp3 = (C2288Rp3) hashMap.get(hVar);
        if (c2288Rp3 != null) {
            return c2288Rp3;
        }
        C2288Rp3 c2288Rp32 = (C2288Rp3) hVar.B("com.bumptech.glide.manager");
        if (c2288Rp32 == null) {
            c2288Rp32 = new C2288Rp3();
            c2288Rp32.g0 = null;
            hashMap.put(hVar, c2288Rp32);
            C10547us c10547us = new C10547us(hVar);
            c10547us.g(0, c2288Rp32, "com.bumptech.glide.manager", 1);
            c10547us.e(true);
            this.i.obtainMessage(2, hVar).sendToTarget();
        }
        return c2288Rp32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7293lO2.handleMessage(android.os.Message):boolean");
    }
}

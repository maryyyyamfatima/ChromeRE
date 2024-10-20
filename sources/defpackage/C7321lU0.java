package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.c;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lU0 */
/* loaded from: classes.dex */
public final class C7321lU0 implements InterfaceC3762b61, InterfaceC10417uV2, InterfaceC12177zd4 {
    public final c a;
    public final C11834yd4 g;
    public LA1 h = null;
    public C10074tV2 i = null;

    public C7321lU0(c cVar, C11834yd4 c11834yd4) {
        this.a = cVar;
        this.g = c11834yd4;
    }

    @Override // defpackage.InterfaceC12177zd4
    public final C11834yd4 w() {
        b();
        return this.g;
    }

    public final void b() {
        if (this.h == null) {
            this.h = new LA1(this);
            C10074tV2 c10074tV2 = new C10074tV2(this);
            this.i = c10074tV2;
            c10074tV2.a();
            AbstractC7328lV2.a(this);
        }
    }

    @Override // defpackage.JA1
    public final LA1 Z() {
        b();
        return this.h;
    }

    public final void a(EnumC11340xA1 enumC11340xA1) {
        this.h.e(enumC11340xA1);
    }

    @Override // defpackage.InterfaceC3762b61
    public final E02 r() {
        Application application;
        c cVar = this.a;
        Context applicationContext = cVar.B0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        E02 e02 = new E02();
        LinkedHashMap linkedHashMap = e02.a;
        if (application != null) {
            linkedHashMap.put(C10462ud4.a, application);
        }
        linkedHashMap.put(AbstractC7328lV2.a, this);
        linkedHashMap.put(AbstractC7328lV2.b, this);
        Bundle bundle = cVar.l;
        if (bundle != null) {
            linkedHashMap.put(AbstractC7328lV2.c, bundle);
        }
        return e02;
    }

    @Override // defpackage.InterfaceC10417uV2
    public final C9731sV2 A() {
        b();
        return this.i.b;
    }
}

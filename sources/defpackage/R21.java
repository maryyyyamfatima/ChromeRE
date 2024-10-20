package defpackage;

import android.graphics.Typeface;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R21 extends AbstractC5593gS0 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ IZ3 b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Y52 d;
    public final /* synthetic */ HandlerThread e;
    public final /* synthetic */ S21 f;

    public R21(S21 s21, HashMap hashMap, IZ3 iz3, HashSet hashSet, Y52 y52, HandlerThread handlerThread) {
        this.f = s21;
        this.a = hashMap;
        this.b = iz3;
        this.c = hashSet;
        this.d = y52;
        this.e = handlerThread;
    }

    @Override // defpackage.AbstractC5593gS0
    public final void b(Typeface typeface) {
        JZ3 jz3 = new JZ3(typeface);
        Map map = this.a;
        map.put(this.b, jz3);
        S21.a(this.f, map, this.c.size(), this.d, this.e);
    }

    @Override // defpackage.AbstractC5593gS0
    public final void a(int i) {
        JZ3 jz3 = new JZ3(i);
        IZ3 iz3 = this.b;
        Map map = this.a;
        map.put(iz3, jz3);
        S21.a(this.f, map, this.c.size(), this.d, this.e);
    }
}

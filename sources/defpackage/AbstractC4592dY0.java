package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4592dY0 {
    public final InterfaceC9989tE2 a;
    public final Object b;
    public final String c;
    public final C4188cM0[] d;
    public boolean e = true;
    public HashMap f;
    public int g;

    public AbstractC4592dY0(String str, InterfaceC9989tE2 interfaceC9989tE2, C4188cM0... c4188cM0Arr) {
        int i = c4188cM0Arr.length > 0 ? 10 : 1;
        this.c = str;
        this.d = c4188cM0Arr;
        HashMap hashMap = new HashMap(i);
        this.f = hashMap;
        if (c4188cM0Arr.length == 0) {
            hashMap.put(C6230iI.d, new W90());
        }
        this.g = 0;
        this.a = interfaceC9989tE2;
        this.b = new Object();
    }

    public final C5279fY0 b() {
        HashMap hashMap = new HashMap(this.d.length > 0 ? 10 : 1);
        C5279fY0 c5279fY0 = new C5279fY0(this.c, this.d);
        synchronized (this.b) {
            c5279fY0.c = this.f;
            c5279fY0.d = this.g;
            this.f = hashMap;
            this.g = 0;
        }
        return c5279fY0;
    }

    public final void a(C4188cM0... c4188cM0Arr) {
        C4188cM0[] c4188cM0Arr2 = this.d;
        if (Arrays.equals(c4188cM0Arr2, c4188cM0Arr)) {
            return;
        }
        String arrays = Arrays.toString(c4188cM0Arr2);
        String arrays2 = Arrays.toString(c4188cM0Arr);
        StringBuilder sb = new StringBuilder("Streamz ");
        AbstractC9972tB0.a(sb, this.c, " with field diffs: ", arrays, " and ");
        sb.append(arrays2);
        throw new C2793Vm3(sb.toString());
    }
}

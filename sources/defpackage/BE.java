package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BE implements HZ3 {
    public static final C6492j31 d = C6492j31.k("com/google/android/libraries/search/rendering/xuikit/runtime/theme/CachingTypefaceProvider");
    public final InterfaceC0315Cl a;
    public final C4713ds4 b;
    public final Tr4 c;

    @Override // defpackage.HZ3
    public final Typeface b(int i, Context context, String str, boolean z) {
        return null;
    }

    public BE(Tr4 tr4, InterfaceC0315Cl interfaceC0315Cl, C4713ds4 c4713ds4) {
        this.a = interfaceC0315Cl;
        this.b = c4713ds4;
        this.c = tr4;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [AE] */
    @Override // defpackage.HZ3
    public final Typeface a(Context context, String str) {
        RD1 rd1;
        RD1 rd12;
        C4713ds4 c4713ds4 = this.b;
        InterfaceC0315Cl interfaceC0315Cl = this.a;
        synchronized (c4713ds4.b) {
            if (!c4713ds4.a.containsKey(str)) {
                c4713ds4.a.put(str, interfaceC0315Cl.a(str));
            }
        }
        C4713ds4 c4713ds42 = this.b;
        synchronized (c4713ds42.b) {
            rd1 = (RD1) c4713ds42.a.get(str);
        }
        Objects.requireNonNull(rd1);
        ?? r0 = new CV0() { // from class: AE
            @Override // defpackage.CV0
            public final Object apply(Object obj) {
                C6492j31 c6492j31 = BE.d;
                return null;
            }
        };
        int i = AbstractC4575dU3.a;
        C3888bU3 c3888bU3 = new C3888bU3(AbstractC6294iU3.g(), r0);
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        int i2 = E0.l;
        D0 d0 = new D0(rd1, c3888bU3);
        rd1.f(d0, enumC6747jo0);
        AbstractC5957hW0.d(d0);
        C4713ds4 c4713ds43 = this.b;
        synchronized (c4713ds43.b) {
            rd12 = (RD1) c4713ds43.a.get(str);
        }
        try {
            Objects.requireNonNull(rd12);
            return (Typeface) rd12.get();
        } catch (InterruptedException | ExecutionException e) {
            ((InterfaceC5462g31) ((InterfaceC5462g31) ((InterfaceC5462g31) d.f().l(Tr4.c, this.c.a())).f(e)).g("com/google/android/libraries/search/rendering/xuikit/runtime/theme/CachingTypefaceProvider", 139, "getTypeface", "CachingTypefaceProvider.java")).o(new C7664mU(str), "Error loading typeface: %s");
            return null;
        }
    }
}

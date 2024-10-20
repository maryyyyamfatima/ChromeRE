package defpackage;

import J.N;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class JD0 implements Callback {
    public final /* synthetic */ OD0 a;
    public final /* synthetic */ C10185to4 g;
    public final /* synthetic */ MC2 h;

    public /* synthetic */ JD0(OD0 od0, C10185to4 c10185to4, MC2 mc2) {
        this.a = od0;
        this.g = c10185to4;
        this.h = mc2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final List list = (List) obj;
        OD0 od0 = this.a;
        od0.getClass();
        int i = 1;
        C12243zo4[] c12243zo4Arr = new C12243zo4[1];
        C11214wo4 c11214wo4 = (C11214wo4) C12243zo4.n.j();
        final C10185to4 c10185to4 = this.g;
        String str = c10185to4.b;
        if (c11214wo4.h) {
            c11214wo4.l();
            c11214wo4.h = false;
        }
        C12243zo4 c12243zo4 = (C12243zo4) c11214wo4.g;
        c12243zo4.getClass();
        str.getClass();
        c12243zo4.j |= 1;
        c12243zo4.k = str;
        C10528uo4 c10528uo4 = (C10528uo4) C10871vo4.m.j();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = c10185to4.a;
        long seconds = timeUnit.toSeconds(j);
        if (c10528uo4.h) {
            c10528uo4.l();
            c10528uo4.h = false;
        }
        C10871vo4 c10871vo4 = (C10871vo4) c10528uo4.g;
        c10871vo4.j |= 1;
        c10871vo4.k = seconds;
        int nanos = (int) timeUnit.toNanos(j % 1000);
        if (c10528uo4.h) {
            c10528uo4.l();
            c10528uo4.h = false;
        }
        C10871vo4 c10871vo42 = (C10871vo4) c10528uo4.g;
        c10871vo42.j |= 2;
        c10871vo42.l = nanos;
        C10871vo4 c10871vo43 = (C10871vo4) c10528uo4.j();
        if (c11214wo4.h) {
            c11214wo4.l();
            c11214wo4.h = false;
        }
        C12243zo4 c12243zo42 = (C12243zo4) c11214wo4.g;
        c12243zo42.getClass();
        c10871vo43.getClass();
        c12243zo42.l = c10871vo43;
        c12243zo42.j |= 2;
        int i2 = c10185to4.c;
        if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 3;
        }
        if (c11214wo4.h) {
            c11214wo4.l();
            c11214wo4.h = false;
        }
        C12243zo4 c12243zo43 = (C12243zo4) c11214wo4.g;
        c12243zo43.getClass();
        c12243zo43.m = AbstractC2373Sg3.b(i);
        c12243zo43.j |= 4;
        c12243zo4Arr[0] = (C12243zo4) c11214wo4.j();
        List asList = Arrays.asList(c12243zo4Arr);
        final MC2 mc2 = this.h;
        Callback callback = new Callback() { // from class: ED0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                MC2 mc22 = mc2;
                if (booleanValue) {
                    list.add(c10185to4);
                    mc22.b(null);
                } else {
                    mc22.e(null);
                }
            }
        };
        UsageStatsBridge usageStatsBridge = od0.a;
        usageStatsBridge.getClass();
        byte[][] bArr = new byte[asList.size()];
        for (int i3 = 0; i3 < asList.size(); i3++) {
            bArr[i3] = ((C12243zo4) asList.get(i3)).toByteArray();
        }
        N.M$1mbh6c(usageStatsBridge.b, usageStatsBridge, bArr, callback);
    }
}

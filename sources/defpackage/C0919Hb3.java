package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hb3 */
/* loaded from: classes.dex */
public final class C0919Hb3 extends AbstractC6471j {
    public static final Set f;
    public static final BW1 g;
    public final String b;
    public final boolean c;
    public final Set d;
    public final BW1 e;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC6227iH1.a, C9.a)));
        f = unmodifiableSet;
        g = JW1.a(unmodifiableSet);
        Level level = Level.ALL;
    }

    @Override // defpackage.AbstractC6232iI1
    public final boolean c(Level level) {
        Level level2 = Level.SEVERE;
        return Log.isLoggable(this.b, 6) || Log.isLoggable("all", 6);
    }

    public C0919Hb3(String str, String str2, boolean z, boolean z2, Level level, Set set, BW1 bw1) {
        super(str2);
        this.b = WH1.a(str, str2, z);
        this.c = z2;
        this.d = set;
        this.e = bw1;
    }

    @Override // defpackage.AbstractC6232iI1
    public final void d(InterfaceC6913kH1 interfaceC6913kH1) {
        e(interfaceC6913kH1, this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0244, code lost:            if (((r1.h & 128) != 0) != false) goto L1068;     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.InterfaceC6913kH1 r28, java.lang.String r29, boolean r30, java.util.Set r31, defpackage.BW1 r32) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0919Hb3.e(kH1, java.lang.String, boolean, java.util.Set, BW1):void");
    }
}

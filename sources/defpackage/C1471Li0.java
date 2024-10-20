package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.List;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Li0 */
/* loaded from: classes2.dex */
public final class C1471Li0 extends AbstractC0185Bl {
    public final InterfaceC1341Ki0 h;
    public final Uri i;
    public final int j;
    public final boolean k;
    public final int l;
    public long m;
    public final ContentResolver n;
    public int o;
    public String p;
    public float q;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        List list = (List) obj;
        if (h()) {
            return;
        }
        InterfaceC1341Ki0 interfaceC1341Ki0 = this.h;
        if (list == null) {
            ((BinderC2640Ui0) interfaceC1341Ki0).M0(this.i, null, "", this.k, this.o, 1.0f);
        } else {
            ((BinderC2640Ui0) interfaceC1341Ki0).M0(this.i, list, this.p, this.k, this.o, this.q);
        }
    }

    public C1471Li0(InterfaceC1341Ki0 interfaceC1341Ki0, ContentResolver contentResolver, Uri uri, int i, boolean z, int i2, long j) {
        this.h = interfaceC1341Ki0;
        this.n = contentResolver;
        this.i = uri;
        this.j = i;
        this.k = z;
        this.l = i2;
        this.m = j;
    }

    public static String n(Long l) {
        if (l == null) {
            return null;
        }
        long longValue = l.longValue() / 1000;
        long j = longValue / 3600;
        long j2 = longValue - (3600 * j);
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        return j > 0 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j4)) : String.format(Locale.US, "%d:%02d", Long.valueOf(j3), Long.valueOf(j4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:            if (0 != 0) goto L413;     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00cb: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:52:0x00cb */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be  */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1471Li0.b():java.lang.Object");
    }
}

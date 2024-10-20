package defpackage;

import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V11 extends AbstractC3510aO implements U11 {
    public static final long f = TimeUnit.SECONDS.toMillis(1);
    public static final RegisterSectionInfo g;
    public DocumentContents d;
    public DocumentId e;

    static {
        ArrayList arrayList = new ArrayList();
        g = new RegisterSectionInfo("SsbContext", "blob", true, 1, false, null, (Feature[]) arrayList.toArray(new Feature[arrayList.size()]), null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V11(android.content.Context r3) {
        /*
            r2 = this;
            s11 r0 = new s11
            android.content.Context r1 = r3.getApplicationContext()
            r0.<init>(r1)
            ad r1 = defpackage.AbstractC0680Fg.a
            r0.a(r1)
            N11 r0 = r0.b()
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V11.<init>(android.content.Context):void");
    }
}

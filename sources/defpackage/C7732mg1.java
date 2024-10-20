package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mg1 */
/* loaded from: classes.dex */
public final class C7732mg1 extends AbstractC8420og1 {
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ FW0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7732mg1(C9106qg1 c9106qg1, U11 u11, String str, String str2, FW0 fw0) {
        super(c9106qg1, u11);
        this.j = str;
        this.k = str2;
        this.l = fw0;
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        V11 v11 = (V11) ((U11) zn);
        Context context = v11.a;
        String packageName = context.getPackageName();
        String str = this.j;
        DocumentId documentId = new DocumentId(packageName, "", str);
        String str2 = this.k;
        FW0 fw0 = this.l;
        C10834vi3 a = HW0.a(context, str, str2, fw0);
        if (!a.n) {
            P60.a(13);
            return;
        }
        C1202Jg1 a2 = C1202Jg1.a();
        Profile d = Profile.d();
        a2.getClass();
        Account a3 = CoreAccountInfo.a(C1202Jg1.b(d).b(1));
        NW0 c = NW0.c(context);
        if (!c.a()) {
            if (a3 == null) {
                P60.a(14);
                return;
            } else if (c.d == null) {
                P60.a(15);
                return;
            } else {
                P60.a(16);
                return;
            }
        }
        String str3 = null;
        DocumentSection documentSection = new DocumentSection(null, V11.g, DocumentSection.j, a.toByteArray());
        ArrayList arrayList = new ArrayList();
        arrayList.add(documentSection);
        DocumentSection[] documentSectionArr = (DocumentSection[]) arrayList.toArray(new DocumentSection[arrayList.size()]);
        DocumentContents documentContents = new DocumentContents(documentSectionArr, "WebPage", false, a3);
        if (documentSectionArr != null) {
            String[] strArr = AbstractC9908t01.a;
            BitSet bitSet = new BitSet(10);
            for (DocumentSection documentSection2 : documentSectionArr) {
                int i = documentSection2.h;
                if (i != -1) {
                    if (bitSet.get(i)) {
                        if (i >= 0 && i < 10) {
                            str3 = AbstractC9908t01.a[i];
                        }
                        throw new IllegalArgumentException(AbstractC4809e90.a("Duplicate global search section type ", str3));
                    }
                    bitSet.set(i);
                }
            }
        }
        UsageInfo[] usageInfoArr = {new UsageInfo(documentId, System.currentTimeMillis(), 4, documentContents)};
        AbstractC10600v11 abstractC10600v11 = v11.b;
        Status status = (Status) abstractC10600v11.f(new W34(abstractC10600v11, usageInfoArr)).c(V11.f, TimeUnit.MILLISECONDS);
        T11.c(status, fw0 == null ? "reportContext" : "reportContextSel");
        if (status == null) {
            P60.a(17);
            return;
        }
        if (!status.r1()) {
            P60.a(18);
            return;
        }
        v11.d = documentContents;
        v11.e = documentId;
        if (fw0 == null) {
            P60.a(0);
        } else {
            P60.a(19);
        }
    }

    @Override // defpackage.B30
    public final void b() {
        P60.a(12);
    }
}

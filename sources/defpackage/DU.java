package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DU {
    public final int a;
    public C4632df0 b;
    public final C2750Ve0 c;
    public final C0118Ax2 d;
    public final AbstractServiceConnectionC0378Cx2 e;
    public final HashSet f = new HashSet();
    public OriginVerifier g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public BU o;
    public String p;
    public long q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    public DU(Context context, int i, C4632df0 c4632df0, C2750Ve0 c2750Ve0, C0118Ax2 c0118Ax2, C2880We0 c2880We0) {
        this.a = i;
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        String str = (packagesForUid.length != 1 || TextUtils.isEmpty(packagesForUid[0])) ? null : packagesForUid[0];
        this.k = str;
        this.b = c4632df0;
        this.c = c2750Ve0;
        this.d = c0118Ax2;
        this.e = c2880We0;
        c2880We0.i = str;
    }
}

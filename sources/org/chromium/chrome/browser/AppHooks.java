package org.chromium.chrome.browser;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import defpackage.AbstractC0940Hg;
import defpackage.AbstractC3362Zw2;
import defpackage.AbstractC4851eH1;
import defpackage.C0438Dj2;
import defpackage.C12008z71;
import defpackage.C12233zn0;
import defpackage.C12260zr3;
import defpackage.C1537Lv2;
import defpackage.C3655ao0;
import defpackage.C4807e84;
import defpackage.C5686gj;
import defpackage.C5756gu3;
import defpackage.C5929hQ2;
import defpackage.C6824k11;
import defpackage.C7736mh;
import defpackage.C8080nh;
import defpackage.C8424oh;
import defpackage.C9496ro1;
import defpackage.C9795sh;
import defpackage.C9926t31;
import defpackage.EX3;
import defpackage.FK;
import defpackage.FX3;
import defpackage.HP;
import defpackage.InterfaceC0048Aj2;
import defpackage.InterfaceC10140th1;
import defpackage.InterfaceC11737yL0;
import defpackage.JW0;
import defpackage.P2;
import defpackage.RB2;
import defpackage.V60;
import defpackage.XN2;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.components.policy.CombinedPolicyProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AppHooks {
    public static C8424oh a;

    public AbstractC0940Hg b() {
        return null;
    }

    public C3655ao0 g() {
        return null;
    }

    public C9926t31 j() {
        return null;
    }

    public XN2 n() {
        return null;
    }

    public String u() {
        return "";
    }

    public C1537Lv2 v() {
        return null;
    }

    public InterfaceC10140th1 w() {
        return null;
    }

    public String z() {
        return "";
    }

    public static AppHooks get() {
        if (a == null) {
            a = new C8424oh();
        }
        return a;
    }

    public P2 a() {
        return new C5756gu3();
    }

    public C9795sh c() {
        return new C9795sh();
    }

    public CustomTabsConnection e() {
        return new CustomTabsConnection();
    }

    public C12260zr3 q() {
        return new C12260zr3();
    }

    public InterfaceC11737yL0 h() {
        return new C7736mh();
    }

    public C6824k11 i() {
        return new C6824k11();
    }

    public JW0 k() {
        return new JW0();
    }

    public C12008z71 l() {
        return new C12008z71();
    }

    public C9496ro1 m() {
        return new C9496ro1();
    }

    public RB2 o() {
        return new RB2();
    }

    public C5929hQ2 p() {
        return new C5929hQ2();
    }

    public C4807e84 s() {
        return new C4807e84();
    }

    public AbstractC3362Zw2 y() {
        return new C8080nh();
    }

    public void A(CombinedPolicyProvider combinedPolicyProvider) {
        combinedPolicyProvider.b(new C5686gj(V60.a));
    }

    public InterfaceC0048Aj2 x() {
        Uri uri = C0438Dj2.g;
        try {
            Cursor query = V60.a.getContentResolver().query(C0438Dj2.g, C0438Dj2.h, null, null, "type DESC, _id ASC");
            if (query == null) {
                return null;
            }
            return new C0438Dj2(query);
        } catch (SQLiteException e) {
            AbstractC4851eH1.a("PartnerBookmarks", "Unable to read partner bookmark database", e);
            return null;
        }
    }

    public C12233zn0 f() {
        return new C12233zn0();
    }

    public EX3 r() {
        return new FX3();
    }

    public FK t() {
        return new FK();
    }

    public HP d() {
        return new HP();
    }
}

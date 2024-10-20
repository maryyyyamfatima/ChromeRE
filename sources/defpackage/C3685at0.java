package defpackage;

import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.UUID;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: at0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3685at0 {
    public static final C3685at0 h = new C3685at0(new C6161i50(), -1, null, false, "", false, false);
    public final int a;
    public final OTRProfileID b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final C6161i50 f;
    public final boolean g;

    public C3685at0(C6161i50 c6161i50, int i, OTRProfileID oTRProfileID, boolean z, String str, boolean z2, boolean z3) {
        this.a = i;
        this.b = oTRProfileID;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = c6161i50 == null ? new C6161i50() : c6161i50;
        this.g = z3;
    }

    public static C3685at0 b(String str) {
        C3685at0 c3685at0 = h;
        try {
            switch (Integer.parseInt(str.substring(0, str.indexOf(",")))) {
                case 1:
                    String[] split = str.split(",", 6);
                    if (split.length != 6) {
                        return c3685at0;
                    }
                    String str2 = split[0];
                    String str3 = split[1];
                    String str4 = split[2];
                    String str5 = split[3];
                    String str6 = split[4];
                    try {
                        return (Integer.parseInt(str2) == 1 && a(str6)) ? new C3685at0(AbstractC8531oz1.a(str6, false), Integer.parseInt(str3), "1".equals(str4) ? null : OTRProfileID.b, "1".equals(str5), split[5], true, false) : c3685at0;
                    } catch (NumberFormatException unused) {
                        return c3685at0;
                    }
                case 2:
                    String[] split2 = str.split(",", 6);
                    if (split2.length != 6) {
                        return c3685at0;
                    }
                    String str7 = split2[0];
                    String str8 = split2[1];
                    String str9 = split2[2];
                    String str10 = split2[3];
                    String str11 = split2[4];
                    try {
                        return (Integer.parseInt(str7) == 2 && a(str11)) ? new C3685at0(AbstractC8531oz1.a(str11, false), Integer.parseInt(str8), "1".equals(str9) ? OTRProfileID.b : null, "1".equals(str10), split2[5], true, false) : c3685at0;
                    } catch (NumberFormatException unused2) {
                        return c3685at0;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    String[] split3 = str.split(",", 7);
                    if (split3.length != 7) {
                        return c3685at0;
                    }
                    String str12 = split3[0];
                    String str13 = split3[1];
                    String str14 = split3[2];
                    String str15 = split3[3];
                    String str16 = split3[4];
                    String str17 = split3[5];
                    String str18 = split3[6];
                    OTRProfileID oTRProfileID = "1".equals(str15) ? OTRProfileID.b : null;
                    boolean equals = "1".equals(str16);
                    try {
                        int parseInt = Integer.parseInt(str12);
                        int parseInt2 = Integer.parseInt(str13);
                        int parseInt3 = Integer.parseInt(str14);
                        if (parseInt != 3 || !a(str17)) {
                            return c3685at0;
                        }
                        if (parseInt3 == 1 || parseInt3 == 2) {
                            return new C3685at0(AbstractC8531oz1.a(str17, parseInt3 == 2), parseInt2, oTRProfileID, equals, str18, true, false);
                        }
                        return c3685at0;
                    } catch (NumberFormatException unused3) {
                        return c3685at0;
                    }
                case 4:
                    String[] split4 = str.split(",", 8);
                    if (split4.length != 8) {
                        return c3685at0;
                    }
                    String str19 = split4[0];
                    String str20 = split4[1];
                    String str21 = split4[2];
                    String str22 = split4[3];
                    String str23 = split4[4];
                    String str24 = split4[5];
                    String str25 = split4[6];
                    String str26 = split4[7];
                    OTRProfileID oTRProfileID2 = "1".equals(str22) ? OTRProfileID.b : null;
                    boolean equals2 = "1".equals(str23);
                    boolean equals3 = "1".equals(str24);
                    try {
                        int parseInt4 = Integer.parseInt(str19);
                        int parseInt5 = Integer.parseInt(str20);
                        int parseInt6 = Integer.parseInt(str21);
                        if (parseInt4 != 4 || !a(str25)) {
                            return c3685at0;
                        }
                        if (parseInt6 == 1 || parseInt6 == 2) {
                            return new C3685at0(AbstractC8531oz1.a(str25, parseInt6 == 2), parseInt5, oTRProfileID2, equals2, str26, equals3, false);
                        }
                        return c3685at0;
                    } catch (NumberFormatException unused4) {
                        return c3685at0;
                    }
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    String[] split5 = str.split(",", 8);
                    if (split5.length != 8) {
                        return c3685at0;
                    }
                    String str27 = split5[0];
                    String str28 = split5[1];
                    String str29 = split5[2];
                    String str30 = split5[3];
                    String str31 = split5[4];
                    String str32 = split5[5];
                    String str33 = split5[6];
                    try {
                        return (Integer.parseInt(str27) == 5 && a(str30) && !TextUtils.isEmpty(str29)) ? new C3685at0(new C6161i50(str29, str30), Integer.parseInt(str28), "1".equals(str31) ? OTRProfileID.b : null, "1".equals(str32), split5[7], "1".equals(str33), false) : c3685at0;
                    } catch (NumberFormatException unused5) {
                        return c3685at0;
                    }
                case 6:
                    String[] split6 = str.split(",", 9);
                    if (split6.length != 9) {
                        return c3685at0;
                    }
                    String str34 = split6[0];
                    String str35 = split6[1];
                    String str36 = split6[2];
                    String str37 = split6[3];
                    String str38 = split6[4];
                    String str39 = split6[5];
                    String str40 = split6[6];
                    String str41 = split6[7];
                    String str42 = split6[8];
                    try {
                        return (Integer.parseInt(str34) != 6 || TextUtils.isEmpty(str37) || TextUtils.isEmpty(str36)) ? c3685at0 : new C3685at0(new C6161i50(str36, str37), Integer.parseInt(str35), "1".equals(str38) ? OTRProfileID.b : null, "1".equals(str39), str42, "1".equals(str40), "1".equals(str41));
                    } catch (NumberFormatException unused6) {
                        return c3685at0;
                    }
                case 7:
                    String[] split7 = str.split(",", 9);
                    if (split7.length != 9) {
                        return c3685at0;
                    }
                    String str43 = split7[0];
                    String str44 = split7[1];
                    String str45 = split7[2];
                    String str46 = split7[3];
                    String str47 = split7[4];
                    String str48 = split7[5];
                    String str49 = split7[6];
                    String str50 = split7[7];
                    String str51 = split7[8];
                    if (TextUtils.isEmpty(str46) || TextUtils.isEmpty(str45)) {
                        return c3685at0;
                    }
                    if (!"".equals(str47)) {
                        try {
                            r8 = OTRProfileID.a(str47);
                        } catch (IllegalStateException unused7) {
                            r8 = OTRProfileID.b;
                        }
                    }
                    try {
                        return Integer.parseInt(str43) != 7 ? c3685at0 : new C3685at0(new C6161i50(str45, str46), Integer.parseInt(str44), r8, "1".equals(str48), str51, "1".equals(str49), "1".equals(str50));
                    } catch (NumberFormatException unused8) {
                        return c3685at0;
                    }
                default:
                    return c3685at0;
            }
        } catch (NumberFormatException unused9) {
            AbstractC4851eH1.f("DownloadEntry", AbstractC4809e90.a("Exception while parsing pending download:", str), new Object[0]);
            return c3685at0;
        }
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.equalsIgnoreCase(UUID.fromString(str).toString());
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C3685at0)) {
            return false;
        }
        C3685at0 c3685at0 = (C3685at0) obj;
        if (!this.f.equals(c3685at0.f) || !TextUtils.equals(this.d, c3685at0.d) || this.a != c3685at0.a) {
            return false;
        }
        OTRProfileID oTRProfileID = OTRProfileID.b;
        OTRProfileID oTRProfileID2 = this.b;
        OTRProfileID oTRProfileID3 = c3685at0.b;
        if (oTRProfileID2 == null) {
            equals = oTRProfileID3 == null;
        } else {
            equals = oTRProfileID2.equals(oTRProfileID3);
        }
        return equals && this.c == c3685at0.c && this.e == c3685at0.e && this.g == c3685at0.g;
    }

    public final int hashCode() {
        OTRProfileID oTRProfileID = this.b;
        return ((this.d.hashCode() + ((this.f.hashCode() + ((((((((1147 + (oTRProfileID != null ? oTRProfileID.hashCode() : 0)) * 37) + (this.c ? 1 : 0)) * 37) + (this.e ? 1 : 0)) * 37) + this.a) * 37)) * 37)) * 37) + (this.g ? 1 : 0);
    }
}

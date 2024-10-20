package defpackage;

import android.util.Pair;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: el2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5013el2 {
    public static final PD2 a;
    public static final ND2 b;
    public static final PD2 c;
    public static final PD2 d;
    public static final JD2 e;
    public static final JD2 f;
    public static final LD2 g;
    public static final FD2[] h;
    public static final Pair i;

    static {
        PD2 pd2 = new PD2("check_progress", false);
        a = pd2;
        ND2 nd2 = new ND2("check_status");
        b = nd2;
        PD2 pd22 = new PD2("check_timestamp", false);
        c = pd22;
        PD2 pd23 = new PD2("compromised_credentials_count", false);
        d = pd23;
        JD2 jd2 = new JD2("launch_account_checkup_action");
        e = jd2;
        JD2 jd22 = new JD2("restart_button_action");
        f = jd22;
        LD2 ld2 = new LD2("show_check_subtitle");
        g = ld2;
        h = new FD2[]{pd2, nd2, pd22, pd23, jd2, jd22, ld2};
        i = new Pair(-1, -1);
    }
}

package org.chromium.chrome.browser.ntp;

import J.N;
import defpackage.C6967kS0;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ForeignSessionHelper {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface ForeignSessionCallback {
        void onUpdated();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class ForeignSessionWindow {
        public final ArrayList a = new ArrayList();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class ForeignSession {
        public final String a;
        public final String b;
        public final long c;
        public final ArrayList d = new ArrayList();

        public ForeignSession(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }
    }

    public static ForeignSession pushSession(List list, String str, String str2, int i, long j) {
        ForeignSession foreignSession = new ForeignSession(str, str2, j);
        list.add(foreignSession);
        return foreignSession;
    }

    public static ForeignSessionWindow pushWindow(ForeignSession foreignSession, long j, int i) {
        ForeignSessionWindow foreignSessionWindow = new ForeignSessionWindow();
        foreignSession.d.add(foreignSessionWindow);
        return foreignSessionWindow;
    }

    public static void pushTab(ForeignSessionWindow foreignSessionWindow, GURL gurl, String str, long j, int i) {
        foreignSessionWindow.a.add(new C6967kS0(gurl, str, i));
    }

    public ForeignSessionHelper(Profile profile) {
        this.a = N.MpwfXr6h(profile);
    }
}

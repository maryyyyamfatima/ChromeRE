package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.InflateException;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Pj4 {
    public static Pj4 i;
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();
    public int c;
    public ViewGroup d;
    public WebContents e;
    public long f;
    public Oj4 g;
    public boolean h;

    public static Pj4 a() {
        Object obj = ThreadUtils.a;
        if (i == null) {
            i = new Pj4();
        }
        return i;
    }

    public final void b(Context context) {
        Object obj = ThreadUtils.a;
        if (this.d == null || this.c != R.layout.f56820_resource_name_obfuscated_res_0x7f0e00b3) {
            ViewGroup viewGroup = null;
            try {
                TraceEvent i2 = TraceEvent.i("WarmupManager.inflateViewHierarchy", null);
                try {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, AbstractC9942t6.b());
                    ViewGroup viewGroup2 = (ViewGroup) AbstractC3236Yx1.a(R.layout.f58680_resource_name_obfuscated_res_0x7f0e017b, contextThemeWrapper, new FrameLayout(contextThemeWrapper));
                    ViewStub viewStub = (ViewStub) viewGroup2.findViewById(R.id.control_container_stub);
                    viewStub.setLayoutResource(R.layout.f56820_resource_name_obfuscated_res_0x7f0e00b3);
                    viewStub.inflate();
                    B80 b80 = (B80) viewGroup2.findViewById(R.id.control_container);
                    if (b80 != null) {
                        ((ToolbarControlContainer) b80).c(R.layout.f56850_resource_name_obfuscated_res_0x7f0e00b6);
                    }
                    if (i2 != null) {
                        i2.close();
                    }
                    viewGroup = viewGroup2;
                } catch (Throwable th) {
                    if (i2 != null) {
                        try {
                            i2.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (InflateException e) {
                AbstractC4851eH1.a("WarmupManager", "Inflation exception.", e);
                PostTask.c(QF3.h, new DP(new Throwable("This is not a crash. See https://crbug.com/1259276 for details.", e)));
            }
            this.d = viewGroup;
            this.c = R.layout.f56820_resource_name_obfuscated_res_0x7f0e00b3;
        }
    }

    public final void c(String str, Profile profile) {
        Object obj = ThreadUtils.a;
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return;
        }
        String scheme = parse.normalizeScheme().getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            if (this.a.contains(str)) {
                this.b.put(str, profile);
            } else {
                N.Mw6Ub3GC(profile, str);
            }
        }
    }

    public final WebContents d(boolean z, boolean z2, boolean z3) {
        WebContents webContents;
        Object obj = ThreadUtils.a;
        if (z || (webContents = this.e) == null) {
            return null;
        }
        this.e = null;
        webContents.P(this.g);
        this.g = null;
        if (!z2) {
            webContents.T0();
        }
        boolean z4 = this.h;
        int i2 = z4 == z3 ? 1 : 4;
        if (z4) {
            EI2.h(i2, 5, "CustomTabs.SpareWebContents.Status2");
        }
        return webContents;
    }
}

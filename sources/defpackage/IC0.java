package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IC0 extends Fl4 {
    public boolean g;
    public GURL h;
    public final /* synthetic */ LC0 i;

    @Override // defpackage.Fl4
    public final void loadProgressChanged(float f) {
        PC0 pc0 = this.i.e;
        if (pc0 != null) {
            ((ProgressBar) pc0.l.findViewById(R.id.progress_bar)).setProgress(Math.round(f * 100.0f));
        }
    }

    @Override // defpackage.Fl4
    public final void titleWasSet(String str) {
        ((TextView) this.i.e.l.findViewById(R.id.title)).setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IC0(LC0 lc0, WebContents webContents) {
        super(webContents);
        this.i = lc0;
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.a) {
            boolean z = navigationHandle.g;
            LC0 lc0 = this.i;
            if (z) {
                this.g = navigationHandle.i;
                ((TextView) lc0.e.l.findViewById(R.id.origin)).setText(AbstractC10615v34.b(1, ((WebContents) this.a.get()).u()));
                return;
            }
            ZN3.b(R.string.f73310_resource_name_obfuscated_res_0x7f140473, 0, V60.a).d();
            ((m) lc0.a).l(lc0.e, true, 0);
        }
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationNoop(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [HC0] */
    @Override // defpackage.Fl4
    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        if (navigationHandle.c) {
            return;
        }
        GURL gurl = navigationHandle.e;
        if (gurl.equals(this.h)) {
            return;
        }
        boolean z = this.g;
        LC0 lc0 = this.i;
        if (z && T34.k(gurl)) {
            ((m) lc0.a).l(lc0.e, true, 0);
            this.h = null;
            return;
        }
        this.h = gurl;
        final FC0 fc0 = lc0.b;
        final ?? r2 = new Callback() { // from class: HC0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Drawable drawable;
                Drawable drawable2 = (Drawable) obj;
                PC0 pc0 = IC0.this.i.e;
                if (pc0 != null) {
                    if (drawable2 == null) {
                        pc0.q = null;
                        pc0.r.setImageDrawable(null);
                        return;
                    }
                    Drawable drawable3 = pc0.q;
                    if (drawable3 == null || (drawable3 instanceof TransitionDrawable)) {
                        drawable = drawable2;
                    } else {
                        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{pc0.q, drawable2});
                        transitionDrawable.setCrossFadeEnabled(true);
                        transitionDrawable.startTransition(218);
                        drawable = transitionDrawable;
                    }
                    pc0.r.setImageDrawable(drawable);
                    pc0.q = drawable2;
                }
            }
        };
        Profile profile = lc0.g;
        fc0.getClass();
        FaviconHelper$FaviconImageCallback faviconHelper$FaviconImageCallback = new FaviconHelper$FaviconImageCallback() { // from class: EC0
            @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
            public final void onFaviconAvailable(Bitmap bitmap, GURL gurl2) {
                Object e;
                Context context = FC0.this.a;
                if (bitmap != null) {
                    e = AbstractC4855eI0.b(context.getResources(), bitmap);
                } else {
                    e = AbstractC8540p04.e(R.drawable.f47730_resource_name_obfuscated_res_0x7f090212, R.color.f17870_resource_name_obfuscated_res_0x7f07012b, context);
                }
                r2.onResult(e);
            }
        };
        WH0 wh0 = fc0.b;
        wh0.getClass();
        wh0.a(profile, gurl.i(), fc0.c, faviconHelper$FaviconImageCallback);
    }
}

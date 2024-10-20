package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Ta4 {
    public final Context a;
    public final VideoTutorialServiceBridge b;
    public final PropertyModel c;
    public final C1022Hw1 d;
    public final WebContents e;
    public Tutorial f;
    public final Callback g;
    public final Runnable h;
    public final C2967Wv2 i;
    public long j;

    public Ta4(Context context, PropertyModel propertyModel, VideoTutorialServiceBridge videoTutorialServiceBridge, C1022Hw1 c1022Hw1, WebContents webContents, C2967Wv2 c2967Wv2, C11816ya4 c11816ya4, RunnableC12159za4 runnableC12159za4) {
        this.a = context;
        this.c = propertyModel;
        this.b = videoTutorialServiceBridge;
        this.d = c1022Hw1;
        this.e = webContents;
        this.g = c11816ya4;
        this.h = runnableC12159za4;
        this.i = c2967Wv2;
        propertyModel.k(Ua4.a, false);
        propertyModel.k(Ua4.b, false);
        a();
        propertyModel.o(Ua4.k, new Runnable() { // from class: Ja4
            @Override // java.lang.Runnable
            public final void run() {
                Ta4 ta4 = Ta4.this;
                C2837Vv2 c2837Vv2 = ta4.i.c;
                if (((float) c2837Vv2.c) > ((float) c2837Vv2.b) * 0.5f) {
                    AbstractC9764sb4.c(ta4.f.a, 4);
                }
                AbstractC9764sb4.b(ta4.f.a, 1);
                ta4.b.b(new C11479xb4(ta4.f, new Ra4(ta4)));
            }
        });
        propertyModel.o(Ua4.l, new Runnable() { // from class: Ka4
            @Override // java.lang.Runnable
            public final void run() {
                LD2 ld2 = Ua4.b;
                final Ta4 ta4 = Ta4.this;
                ta4.c.k(ld2, true);
                ta4.d.a(ta4.f.a, new Pa4(ta4), new Runnable() { // from class: Qa4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ta4.this.c.k(Ua4.b, false);
                    }
                });
                AbstractC9764sb4.b(ta4.f.a, 0);
            }
        });
        propertyModel.o(Ua4.m, new Runnable() { // from class: La4
            @Override // java.lang.Runnable
            public final void run() {
                Ta4 ta4 = Ta4.this;
                AbstractC9764sb4.b(ta4.f.a, 2);
                ta4.g.onResult(ta4.f);
            }
        });
        propertyModel.o(Ua4.n, new Runnable() { // from class: Ma4
            @Override // java.lang.Runnable
            public final void run() {
                Ta4 ta4 = Ta4.this;
                AbstractC9764sb4.b(ta4.f.a, 3);
                Context context2 = ta4.a;
                Tutorial tutorial = ta4.f;
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", tutorial.h);
                try {
                    context2.startActivity(Intent.createChooser(intent, context2.getString(R.string.f86400_resource_name_obfuscated_res_0x7f140a1a)));
                } catch (ActivityNotFoundException unused) {
                    AbstractC4851eH1.a("VideoTutorialShare", "Cannot find activity for sharing", new Object[0]);
                } catch (Exception e) {
                    AbstractC4851eH1.a("VideoTutorialShare", "Cannot start activity for sharing, exception: " + e, new Object[0]);
                }
            }
        });
        propertyModel.o(Ua4.o, new Runnable() { // from class: Na4
            @Override // java.lang.Runnable
            public final void run() {
                Ta4 ta4 = Ta4.this;
                AbstractC9764sb4.b(ta4.f.a, 4);
                ta4.h.run();
            }
        });
        propertyModel.o(Ua4.i, new Runnable() { // from class: Oa4
            @Override // java.lang.Runnable
            public final void run() {
                Ta4 ta4 = Ta4.this;
                ta4.b(ta4.f);
            }
        });
    }

    public final void b(Tutorial tutorial) {
        C2967Wv2 c2967Wv2 = this.i;
        c2967Wv2.d = null;
        c2967Wv2.e = false;
        c2967Wv2.f = false;
        c2967Wv2.c = new C2837Vv2();
        AbstractC9764sb4.c(this.f.a, 0);
        this.j = System.currentTimeMillis();
        this.f = tutorial;
        LoadUrlParams loadUrlParams = new LoadUrlParams("chrome-untrusted://video-tutorials/?video_url=" + tutorial.c + "&poster_url=" + tutorial.d + "&caption_url=" + tutorial.g, 0);
        loadUrlParams.r = true;
        this.e.i().d(loadUrlParams);
        this.c.k(Ua4.a, false);
        a();
    }

    public final void a() {
        LD2 ld2 = Ua4.c;
        PropertyModel propertyModel = this.c;
        propertyModel.k(ld2, false);
        propertyModel.k(Ua4.f, false);
        propertyModel.k(Ua4.g, false);
        LD2 ld22 = Ua4.d;
        C7928nE c7928nE = UN.a;
        propertyModel.k(ld22, N.M6bsIDpc("VideoTutorials", "enable_share", true));
        propertyModel.k(Ua4.e, true);
        propertyModel.k(Ua4.h, false);
    }
}

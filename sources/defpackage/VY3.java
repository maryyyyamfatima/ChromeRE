package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VY3 {
    public final Context a;
    public final C7616mK1 b;
    public final ImageFetcher c;
    public final Callback d;

    public VY3(C7616mK1 c7616mK1, Context context, VideoTutorialServiceBridge videoTutorialServiceBridge, ImageFetcher imageFetcher, C9079qb4 c9079qb4) {
        this.b = c7616mK1;
        this.a = context;
        this.c = imageFetcher;
        this.d = c9079qb4;
        videoTutorialServiceBridge.b(new Callback() { // from class: RY3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final VY3 vy3 = VY3.this;
                vy3.getClass();
                for (final Tutorial tutorial : (List) obj) {
                    HashMap e = PropertyModel.e(IY3.e);
                    PD2 pd2 = IY3.a;
                    String str = tutorial.b;
                    GD2 gd2 = new GD2();
                    gd2.a = str;
                    e.put(pd2, gd2);
                    PD2 pd22 = IY3.b;
                    String a = AbstractC11822yb4.a(tutorial.i);
                    GD2 gd22 = new GD2();
                    gd22.a = a;
                    e.put(pd22, gd22);
                    PD2 pd23 = IY3.c;
                    Runnable runnable = new Runnable() { // from class: SY3
                        @Override // java.lang.Runnable
                        public final void run() {
                            VY3 vy32 = VY3.this;
                            vy32.getClass();
                            Tutorial tutorial2 = tutorial;
                            AbstractC9764sb4.b(tutorial2.a, 11);
                            vy32.d.onResult(tutorial2);
                        }
                    };
                    GD2 gd23 = new GD2();
                    gd23.a = runnable;
                    e.put(pd23, gd23);
                    PD2 pd24 = IY3.d;
                    InterfaceC3980bl interfaceC3980bl = new InterfaceC3980bl() { // from class: TY3
                        @Override // defpackage.InterfaceC3980bl
                        public final Runnable a(int i, int i2, final C3636al c3636al) {
                            final VY3 vy32 = VY3.this;
                            vy32.getClass();
                            vy32.c.d(C0037Ah1.a(i, tutorial.f, i2, "VideoTutorialsList"), new Callback() { // from class: UY3
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj2) {
                                    return new ZE(this, obj2);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj2) {
                                    VY3 vy33 = VY3.this;
                                    vy33.getClass();
                                    c3636al.onResult(new BitmapDrawable(vy33.a.getResources(), (Bitmap) obj2));
                                }
                            });
                            return new RunnableC12082zL2();
                        }
                    };
                    GD2 gd24 = new GD2();
                    gd24.a = interfaceC3980bl;
                    vy3.b.s(new C7272lK1(3, AbstractC5266fV2.a(e, pd24, gd24, e)));
                }
            }
        });
    }
}

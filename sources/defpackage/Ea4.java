package defpackage;

import J.N;
import android.content.Context;
import android.util.Pair;
import com.android.chrome.R;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Ea4 implements Ca4 {
    public final Va4 a;
    public final Ta4 b;
    public WebContents c;
    public WebContentsDelegateAndroid d;
    public C2967Wv2 e;

    /* JADX WARN: Type inference failed for: r5v0, types: [Da4] */
    public Ea4(Context context, VideoTutorialServiceBridge videoTutorialServiceBridge, C11473xa4 c11473xa4, C5228fO c5228fO, C11816ya4 c11816ya4, RunnableC12159za4 runnableC12159za4, C2021Po1 c2021Po1) {
        PropertyModel propertyModel = new PropertyModel(Ua4.q);
        Pair pair = (Pair) c11473xa4.get();
        WebContents webContents = (WebContents) pair.first;
        this.c = webContents;
        Q50 q50 = (Q50) pair.second;
        this.d = new WebContentsDelegateAndroid();
        this.e = new C2967Wv2((MediaSessionImpl) N.Mtun$qW8(webContents), new InterfaceC0079Ap3() { // from class: Da4
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Ea4.this.b;
            }
        });
        C6586jK3 c6586jK3 = new C6586jK3();
        c6586jK3.a = -16777216;
        C6930kK3 c6930kK3 = new C6930kK3(context, c6586jK3, c2021Po1);
        c6930kK3.a(this.c, q50, this.d);
        Va4 va4 = new Va4(context, c6930kK3);
        this.a = va4;
        this.b = new Ta4(context, propertyModel, videoTutorialServiceBridge, new C1022Hw1(va4.a.findViewById(R.id.language_picker), videoTutorialServiceBridge, c5228fO), this.c, this.e, c11816ya4, runnableC12159za4);
        UD2.a(propertyModel, va4, new C4268cb4());
    }
}

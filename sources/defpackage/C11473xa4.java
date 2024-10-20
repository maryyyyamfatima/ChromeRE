package defpackage;

import android.util.Pair;
import org.chromium.chrome.browser.app.video_tutorials.VideoPlayerActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xa4 */
/* loaded from: classes.dex */
public final /* synthetic */ class C11473xa4 implements InterfaceC0079Ap3 {
    public final /* synthetic */ VideoPlayerActivity a;

    public /* synthetic */ C11473xa4(VideoPlayerActivity videoPlayerActivity) {
        this.a = videoPlayerActivity;
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        int i = VideoPlayerActivity.D;
        VideoPlayerActivity videoPlayerActivity = this.a;
        videoPlayerActivity.getClass();
        WebContents a = Al4.a(Profile.d(), false);
        Q50 q50 = new Q50(videoPlayerActivity, a);
        a.I(new ViewAndroidDelegate(q50), q50, videoPlayerActivity.B, new C6047hl4());
        return Pair.create(a, q50);
    }
}

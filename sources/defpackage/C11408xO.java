package defpackage;

import android.util.SparseArray;
import com.android.chrome.R;
import org.chromium.chrome.browser.media.ui.ChromeMediaNotificationControllerServices$CastListenerService;
import org.chromium.chrome.browser.media.ui.ChromeMediaNotificationControllerServices$PlaybackListenerService;
import org.chromium.chrome.browser.media.ui.ChromeMediaNotificationControllerServices$PresentationListenerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11408xO implements InterfaceC5574gO1 {
    public static final SparseArray b;
    public final int a;

    static {
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(R.id.media_playback_notification, new C10036tO(ChromeMediaNotificationControllerServices$PlaybackListenerService.class, "MediaPlayback"));
        sparseArray.put(R.id.presentation_notification, new C10036tO(ChromeMediaNotificationControllerServices$PresentationListenerService.class, "MediaPresentation"));
        sparseArray.put(R.id.remote_playback_notification, new C10036tO(ChromeMediaNotificationControllerServices$CastListenerService.class, "MediaRemote"));
    }

    public C11408xO(int i) {
        this.a = i;
    }
}

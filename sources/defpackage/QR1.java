package defpackage;

import java.util.HashSet;
import java.util.List;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class QR1 {
    public MediaSessionImpl a;

    public void a(HashSet hashSet) {
    }

    public void b(List list) {
    }

    public void c() {
    }

    public void d(MediaMetadata mediaMetadata) {
    }

    public abstract void e(MediaPosition mediaPosition);

    public abstract void f(boolean z, boolean z2);

    public QR1(MediaSessionImpl mediaSessionImpl) {
        if (mediaSessionImpl instanceof MediaSessionImpl) {
            this.a = mediaSessionImpl;
            mediaSessionImpl.b.a(this);
            Boolean bool = mediaSessionImpl.e;
            if (bool != null) {
                f(mediaSessionImpl.d, bool.booleanValue());
            }
            MediaMetadata mediaMetadata = mediaSessionImpl.f;
            if (mediaMetadata != null) {
                d(mediaMetadata);
            }
            List list = mediaSessionImpl.g;
            if (list != null) {
                b(list);
            }
            MediaPosition mediaPosition = mediaSessionImpl.i;
            if (mediaPosition != null) {
                e(mediaPosition);
            }
            HashSet hashSet = mediaSessionImpl.h;
            if (hashSet != null) {
                a(hashSet);
            }
        }
    }
}

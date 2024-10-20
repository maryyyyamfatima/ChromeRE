package org.chromium.content.browser;

import defpackage.AbstractC7307lR1;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.QR1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.chromium.services.media_session.MediaImage;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaSessionImpl extends AbstractC7307lR1 {
    public long a;
    public final C12157za2 b;
    public final C11814ya2 c;
    public boolean d;
    public Boolean e;
    public MediaMetadata f;
    public List g;
    public HashSet h;
    public MediaPosition i;

    public final boolean hasObservers() {
        return !this.b.isEmpty();
    }

    public final void mediaSessionDestroyed() {
        C11814ya2 c11814ya2 = this.c;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((QR1) c11814ya2.next()).c();
        }
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            QR1 qr1 = (QR1) c11814ya2.next();
            MediaSessionImpl mediaSessionImpl = qr1.a;
            if (mediaSessionImpl != null) {
                mediaSessionImpl.b.d(qr1);
                qr1.a = null;
            }
        }
        this.b.clear();
        this.a = 0L;
    }

    public final void mediaSessionStateChanged(boolean z, boolean z2) {
        this.d = z;
        this.e = Boolean.valueOf(z2);
        C11814ya2 c11814ya2 = this.c;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((QR1) c11814ya2.next()).f(z, z2);
        }
    }

    public final void mediaSessionMetadataChanged(MediaMetadata mediaMetadata) {
        this.f = mediaMetadata;
        C11814ya2 c11814ya2 = this.c;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((QR1) c11814ya2.next()).d(mediaMetadata);
        }
    }

    public final void mediaSessionActionsChanged(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        this.h = hashSet;
        C11814ya2 c11814ya2 = this.c;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((QR1) c11814ya2.next()).a(hashSet);
        }
    }

    public final void mediaSessionArtworkChanged(MediaImage[] mediaImageArr) {
        this.g = Arrays.asList(mediaImageArr);
        C11814ya2 c11814ya2 = this.c;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((QR1) c11814ya2.next()).b(this.g);
        }
    }

    public final void mediaSessionPositionChanged(MediaPosition mediaPosition) {
        this.i = mediaPosition;
        C11814ya2 c11814ya2 = this.c;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((QR1) c11814ya2.next()).e(mediaPosition);
        }
    }

    public static MediaSessionImpl create(long j) {
        return new MediaSessionImpl(j);
    }

    public MediaSessionImpl(long j) {
        this.a = j;
        C12157za2 c12157za2 = new C12157za2();
        this.b = c12157za2;
        this.c = c12157za2.f();
    }
}

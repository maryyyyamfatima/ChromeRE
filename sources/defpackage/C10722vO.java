package defpackage;

import android.content.IntentFilter;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10722vO extends AbstractC9693sO {
    public final C10379uO c;

    @Override // defpackage.AbstractC9693sO, defpackage.AbstractC1598Mh3
    public final void c() {
        this.a.unregisterReceiver(this.c);
        super.c();
    }

    public C10722vO() {
        super(R.id.media_playback_notification);
        this.c = new C10379uO();
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void b() {
        this.a.registerReceiver(this.c, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
}

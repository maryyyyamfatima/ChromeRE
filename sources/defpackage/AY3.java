package defpackage;

import J.N;
import android.speech.tts.UtteranceProgressListener;
import org.chromium.base.task.PostTask;
import org.chromium.content.browser.TtsPlatformImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class AY3 extends UtteranceProgressListener {
    public final /* synthetic */ TtsPlatformImpl a;

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(final String str) {
        final TtsPlatformImpl ttsPlatformImpl = this.a;
        ttsPlatformImpl.getClass();
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: zY3
            @Override // java.lang.Runnable
            public final void run() {
                long j = TtsPlatformImpl.this.a;
                if (j != 0) {
                    N.M47GdBO5(j, Integer.parseInt(str));
                }
            }
        });
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(final String str, int i) {
        final TtsPlatformImpl ttsPlatformImpl = this.a;
        ttsPlatformImpl.getClass();
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: xY3
            @Override // java.lang.Runnable
            public final void run() {
                long j = TtsPlatformImpl.this.a;
                if (j != 0) {
                    N.M1Kw17GB(j, Integer.parseInt(str));
                }
            }
        });
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(final String str) {
        final TtsPlatformImpl ttsPlatformImpl = this.a;
        ttsPlatformImpl.getClass();
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: yY3
            @Override // java.lang.Runnable
            public final void run() {
                long j = TtsPlatformImpl.this.a;
                if (j != 0) {
                    N.M2$X0reE(j, Integer.parseInt(str));
                }
            }
        });
    }

    public AY3(TtsPlatformImpl ttsPlatformImpl) {
        this.a = ttsPlatformImpl;
    }
}

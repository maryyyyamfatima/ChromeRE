package defpackage;

import android.speech.tts.TextToSpeech;
import java.util.List;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GY3 {
    public final TextToSpeech a;
    public List b;
    public boolean c;
    public String d;
    public BY3 e;
    public final long f;

    public GY3(long j) {
        this.f = j;
        this.c = false;
        this.a = new TextToSpeech(V60.a, new TextToSpeech.OnInitListener() { // from class: DY3
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i) {
                final GY3 gy3 = GY3.this;
                gy3.getClass();
                if (i == 0) {
                    PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: EY3
                        @Override // java.lang.Runnable
                        public final void run() {
                            GY3 gy32 = GY3.this;
                            TraceEvent.j(gy32.hashCode(), "TtsEngine:initialize_default");
                            new FY3(gy32).c(AbstractC0185Bl.e);
                        }
                    });
                }
            }
        });
    }

    public GY3(String str) {
        this.c = false;
        this.a = new TextToSpeech(V60.a, new TextToSpeech.OnInitListener() { // from class: CY3
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i) {
                GY3 gy3 = GY3.this;
                if (i != 0) {
                    gy3.getClass();
                    return;
                }
                gy3.c = true;
                BY3 by3 = gy3.e;
                if (by3 != null) {
                    by3.a.speak(by3.b, by3.c, by3.d, by3.e, by3.f, by3.g, by3.h);
                }
            }
        }, str);
    }
}

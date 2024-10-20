package org.chromium.content.browser;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.speech.SpeechRecognizer;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC4983eg2;
import defpackage.C2893Wg3;
import defpackage.V60;
import defpackage.ZN3;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SpeechRecognitionImpl {
    public static ComponentName f;
    public int a;
    public final Intent b;
    public SpeechRecognizer c;
    public long d;
    public boolean e = false;

    public static ComponentName a(int i, String str) {
        Context context = V60.a;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 4).iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo.packageName.equals(str) && (i == -1 || AbstractC4983eg2.c(context, serviceInfo.packageName) >= i)) {
                return new ComponentName(serviceInfo.packageName, serviceInfo.name);
            }
        }
        return null;
    }

    public SpeechRecognitionImpl(long j) {
        this.d = j;
        C2893Wg3 c2893Wg3 = new C2893Wg3(this);
        this.b = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        ComponentName componentName = f;
        if (componentName != null) {
            this.c = SpeechRecognizer.createSpeechRecognizer(V60.a, componentName);
        } else {
            this.c = SpeechRecognizer.createSpeechRecognizer(V60.a);
        }
        this.c.setRecognitionListener(c2893Wg3);
    }

    public final void b(int i) {
        long j = this.d;
        if (j == 0) {
            return;
        }
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 2) {
                N.MFB2QCbe(j, this);
            }
            N.M2TRi32V(this.d, this);
            this.a = 0;
        }
        if (i != 0) {
            N.MUf_fHKN(this.d, this, i);
        }
        try {
            this.c.destroy();
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.f("SpeechRecog", "Destroy threw exception " + this.c, e);
        }
        this.c = null;
        N.MmgQYR9M(this.d, this);
        this.d = 0L;
    }

    public static SpeechRecognitionImpl createSpeechRecognition(long j) {
        return new SpeechRecognitionImpl(j);
    }

    public final void startRecognition(String str, boolean z, boolean z2) {
        if (this.c == null) {
            return;
        }
        this.e = z;
        Intent intent = this.b;
        intent.putExtra("android.speech.extra.DICTATION_MODE", z);
        intent.putExtra("android.speech.extra.LANGUAGE", str);
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", z2);
        try {
            this.c.startListening(intent);
        } catch (SecurityException unused) {
            Context context = V60.a;
            ZN3.c(context, context.getResources().getString(R.string.f87470_resource_name_obfuscated_res_0x7f140a87), 0).d();
        }
    }

    public final void abortRecognition() {
        SpeechRecognizer speechRecognizer = this.c;
        if (speechRecognizer == null) {
            return;
        }
        speechRecognizer.cancel();
        b(2);
    }

    public final void stopRecognition() {
        SpeechRecognizer speechRecognizer = this.c;
        if (speechRecognizer == null) {
            return;
        }
        this.e = false;
        speechRecognizer.stopListening();
    }
}

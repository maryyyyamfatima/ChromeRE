package defpackage;

import J.N;
import android.os.Bundle;
import android.speech.RecognitionListener;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import org.chromium.content.browser.SpeechRecognitionImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wg3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2893Wg3 implements RecognitionListener {
    public final /* synthetic */ SpeechRecognitionImpl a;

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }

    public final void a(Bundle bundle, boolean z) {
        SpeechRecognitionImpl speechRecognitionImpl = this.a;
        if (speechRecognitionImpl.d == 0) {
            return;
        }
        if (speechRecognitionImpl.e && z) {
            z = false;
        }
        boolean z2 = z;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        String[] strArr = (String[]) stringArrayList.toArray(new String[stringArrayList.size()]);
        float[] floatArray = bundle.getFloatArray("confidence_scores");
        SpeechRecognitionImpl speechRecognitionImpl2 = this.a;
        N.MnkvkoGY(speechRecognitionImpl2.d, speechRecognitionImpl2, strArr, floatArray, z2);
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        SpeechRecognitionImpl speechRecognitionImpl = this.a;
        long j = speechRecognitionImpl.d;
        if (j == 0) {
            return;
        }
        speechRecognitionImpl.a = 2;
        N.M2Nl8ID9(j, speechRecognitionImpl);
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        SpeechRecognitionImpl speechRecognitionImpl = this.a;
        if (speechRecognitionImpl.e) {
            return;
        }
        long j = speechRecognitionImpl.d;
        if (j == 0) {
            return;
        }
        N.MFB2QCbe(j, speechRecognitionImpl);
        N.M2TRi32V(speechRecognitionImpl.d, speechRecognitionImpl);
        speechRecognitionImpl.a = 0;
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        int i2;
        switch (i) {
            case 1:
            case 2:
            case 4:
                i2 = 4;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i2 = 3;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                i2 = 2;
                break;
            case 6:
                i2 = 1;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
            case 9:
                i2 = 5;
                break;
            default:
                return;
        }
        this.a.b(i2);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SpeechRecognitionImpl speechRecognitionImpl = this.a;
        long j = speechRecognitionImpl.d;
        if (j == 0) {
            return;
        }
        speechRecognitionImpl.a = 1;
        N.MdhaXGcn(j, speechRecognitionImpl);
    }

    public C2893Wg3(SpeechRecognitionImpl speechRecognitionImpl) {
        this.a = speechRecognitionImpl;
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        a(bundle, true);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        a(bundle, false);
        this.a.b(0);
    }
}

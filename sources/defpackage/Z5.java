package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z5 {
    public final /* synthetic */ String a;
    public final /* synthetic */ U5 b;
    public final /* synthetic */ AbstractC3760b6 c;

    public Z5(AbstractC3760b6 abstractC3760b6, String str, U5 u5) {
        this.c = abstractC3760b6;
        this.a = str;
        this.b = u5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Object obj) {
        Bundle bundle;
        AbstractC3760b6 abstractC3760b6 = this.c;
        HashMap hashMap = abstractC3760b6.c;
        String str = this.a;
        Integer num = (Integer) hashMap.get(str);
        U5 u5 = this.b;
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + u5 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        abstractC3760b6.e.add(str);
        int intValue = num.intValue();
        C5099f00 c5099f00 = (C5099f00) abstractC3760b6;
        AbstractActivityC6817k00 abstractActivityC6817k00 = c5099f00.i;
        T5 b = u5.b(abstractActivityC6817k00, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4412d00(c5099f00, intValue, b));
            return;
        }
        Intent a = u5.a(abstractActivityC6817k00, obj);
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(abstractActivityC6817k00.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            int i = D5.c;
            for (String str2 : stringArrayExtra) {
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalArgumentException(Y5.a(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            if (abstractActivityC6817k00 instanceof C5) {
                ((C5) abstractActivityC6817k00).getClass();
            }
            abstractActivityC6817k00.requestPermissions(stringArrayExtra, intValue);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.a;
                Intent intent = intentSenderRequest.g;
                int i2 = intentSenderRequest.h;
                int i3 = intentSenderRequest.i;
                int i4 = D5.c;
                abstractActivityC6817k00.startIntentSenderForResult(intentSender, intValue, intent, i2, i3, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4755e00(c5099f00, intValue, e));
                return;
            }
        }
        int i5 = D5.c;
        abstractActivityC6817k00.startActivityForResult(a, intValue, bundle);
    }

    public final void b() {
        Integer num;
        AbstractC3760b6 abstractC3760b6 = this.c;
        ArrayList arrayList = abstractC3760b6.e;
        String str = this.a;
        if (!arrayList.contains(str) && (num = (Integer) abstractC3760b6.c.remove(str)) != null) {
            abstractC3760b6.b.remove(num);
        }
        abstractC3760b6.f.remove(str);
        HashMap hashMap = abstractC3760b6.g;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = abstractC3760b6.h;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        X5.a(abstractC3760b6.d.get(str));
    }
}

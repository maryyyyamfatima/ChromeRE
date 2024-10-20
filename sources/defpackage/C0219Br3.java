package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.crash.ChromePureJavaExceptionReporter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Br3 */
/* loaded from: classes.dex */
public final class C0219Br3 {
    public static final C0219Br3 i;
    public static final AtomicBoolean j;
    public InterfaceC4064bz2 a;
    public SurveyDataImpl b;
    public String c;
    public List d;
    public long e;
    public final C6442iu3 f = new C6442iu3();
    public String g;
    public long h;

    public static OL2 c(C2298Rr3 c2298Rr3) {
        Context context = OP0.b;
        ((U61) ((T61) S61.g.a.get())).getClass();
        OP0.c(((Boolean) U61.c.a(context)).booleanValue());
        String language = Locale.getDefault().getLanguage();
        Context context2 = OP0.b;
        ((I61) ((H61) G61.g.a.get())).getClass();
        if (OP0.b(((Boolean) I61.a.a(context2)).booleanValue())) {
            language = Locale.getDefault().toLanguageTag();
        }
        return AbstractC0562Ei1.r(language);
    }

    static {
        Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations");
        i = new C0219Br3();
        j = new AtomicBoolean(false);
    }

    public static boolean d(SurveyDataImpl surveyDataImpl) {
        C2553Tq3 c2553Tq3 = surveyDataImpl.h;
        if (c2553Tq3 == null) {
            Log.w("SurveyController", "Survey payload was null.");
            return true;
        }
        if (c2553Tq3.n.size() != 0) {
            return false;
        }
        Log.w("SurveyController", "Survey contains no questions. Survey trigger id: " + surveyDataImpl.a);
        String str = surveyDataImpl.j;
        if (!TextUtils.isEmpty(str)) {
            Log.w("SurveyController", "No survey available reason: " + str);
        }
        AbstractC0562Ei1 abstractC0562Ei1 = surveyDataImpl.l;
        if (abstractC0562Ei1 != null && !abstractC0562Ei1.isEmpty()) {
            Log.w("SurveyController", "Backend errors are: ".concat(String.valueOf(abstractC0562Ei1)));
        }
        return true;
    }

    public C0219Br3() {
        AbstractC1389Kr3.a = new C0089Ar3(this);
        this.e = 0L;
        this.h = System.currentTimeMillis();
    }

    public final void e(C3421a64 c3421a64, C5364fm3 c5364fm3, Context context) {
        String str = TextUtils.isEmpty(this.c) ? null : this.c;
        if (OP0.c(C10747vT.a(OP0.b))) {
            C4931eX1 a = C4931eX1.a();
            S54 s54 = (S54) C4795e64.l.j();
            if (s54.h) {
                s54.l();
                s54.h = false;
            }
            C4795e64 c4795e64 = (C4795e64) s54.g;
            c4795e64.getClass();
            c3421a64.getClass();
            c4795e64.k = c3421a64;
            c4795e64.j = 4;
            a.d((C4795e64) s54.j(), c5364fm3.b(), c5364fm3.a(), context, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v3, types: [JX0, Wq3] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, Zq3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b3 -> B:21:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.libraries.surveys.internal.model.Answer a(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0219Br3.a(android.content.Context):com.google.android.libraries.surveys.internal.model.Answer");
    }

    public final void f(EnumC3372Zy2 enumC3372Zy2) {
        int i2;
        InterfaceC4064bz2 interfaceC4064bz2 = this.a;
        if (interfaceC4064bz2 != null) {
            C9601s61 c9601s61 = (C9601s61) interfaceC4064bz2;
            final String format = String.format("Failed to present survey (trigger id: <%s>, error: <%s>.)", this.b.a().a, enumC3372Zy2);
            AbstractC4851eH1.a("HatsNextController", format, new Object[0]);
            PostTask.c(QF3.h, new Runnable() { // from class: q61
                @Override // java.lang.Runnable
                public final void run() {
                    ChromePureJavaExceptionReporter.d(new Throwable(format));
                }
            });
            switch (enumC3372Zy2.ordinal()) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i2 = 7;
                    break;
                case 4:
                    i2 = 8;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i2 = 9;
                    break;
                case 6:
                    i2 = 10;
                    break;
                case 7:
                    i2 = 11;
                    break;
                case 8:
                    i2 = 12;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            c9601s61.d.getClass();
            C9944t61.e(i2);
        }
    }

    public static Integer b(C2553Tq3 c2553Tq3, C4751dz2 c4751dz2) {
        C10539uq3 c10539uq3 = c2553Tq3.l;
        if (c10539uq3 == null) {
            c10539uq3 = C10539uq3.n;
        }
        int i2 = c10539uq3.k;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 4 : 3 : 2 : 1;
        if (i3 == 0) {
            i3 = 5;
        }
        int b = AbstractC2373Sg3.b(i3);
        int i4 = R.drawable.0_resource_name_obfuscated_res_0x7f0901a0;
        if (b == 2) {
            return Integer.valueOf(R.drawable.0_resource_name_obfuscated_res_0x7f0901a0);
        }
        if (b != 3) {
            return null;
        }
        Integer num = c4751dz2.a;
        if (num != null) {
            i4 = num.intValue();
        }
        return Integer.valueOf(i4);
    }
}

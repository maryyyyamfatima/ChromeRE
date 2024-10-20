package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206Qz1 {
    public static C2206Qz1 t;
    public int a;
    public final C1686Mz1 b;
    public final C4502dG0 c;
    public Handler d;
    public int e;
    public Callback f;
    public Uri g;
    public WebContents h;
    public long i;
    public C6534jA1 j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public I44 q;
    public boolean r;
    public final ArrayList s;

    public static C2206Qz1 g() {
        if (t == null) {
            t = new C2206Qz1();
        }
        return t;
    }

    public final String[] e(int i, C6368ii0 c6368ii0) {
        String str;
        String string = c6368ii0 != null ? c6368ii0.a.getString("image_content_json") : "N/A";
        String[] strArr = new String[7];
        String str2 = this.n;
        if (str2 == null) {
            str2 = "Undefined";
        }
        strArr[0] = str2;
        strArr[1] = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.US).format(new Date());
        strArr[2] = this.k;
        strArr[3] = String.valueOf(this.e);
        strArr[4] = String.valueOf((SystemClock.elapsedRealtimeNanos() - this.i) / 1000000);
        switch (i) {
            case 0:
                str = "Unknown";
                break;
            case 1:
                str = "Completed (Shoppy image)";
                break;
            case 2:
                str = "Completed (Unknown intent type)";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "Completed (Empty result)";
                break;
            case 4:
                str = "Completed (No intent types)";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str = "Error (Invalid callback)";
                break;
            case 6:
                str = "Error (Invalid package signature)";
                break;
            case 7:
                str = "Error (Invalid image uri)";
                break;
            case 8:
                str = "Error (Early terminated)";
                break;
            case 9:
                str = "Disabled (Unclassified)";
                break;
            case 10:
                str = "Error (Additional web context malformed)";
                break;
            case 11:
                str = "Completed (Translatable image)";
                break;
            case 12:
                str = "Error (User context changed)";
                break;
            case 13:
                str = "Disabled (User context changed)";
                break;
            case 14:
                str = "Error (Unexpected state)";
                break;
            case 15:
                str = "Disabled (AGSA Out of Date)";
                break;
            case 16:
                str = "Disabled (OS Out of Date)";
                break;
            case 17:
                str = "Disabled (Not Signed In)";
                break;
            case 18:
                str = "Disabled (UMA Disabled)";
                break;
            case 19:
                str = "Disabled (Incognito)";
                break;
            default:
                str = "Unrecognized result state.";
                break;
        }
        strArr[5] = str;
        strArr[6] = string;
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Oz1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Nz1, org.chromium.base.Callback] */
    public final void l() {
        Uri uri = this.g;
        Bundle bundle = new Bundle();
        C7928nE c7928nE = UN.a;
        if (!N.M6bsIDpc("ContextMenuGoogleLensChip", "readBitmapBeforeSending", false)) {
            V60.a.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
            bundle.putParcelable("uri", uri);
        } else {
            bundle.putParcelable("bitmap", AbstractC7974nN0.c(V60.a, uri));
        }
        final ArrayList arrayList = new ArrayList();
        i("IMAGE_URL", this.g.toString(), arrayList);
        i("ALT_TEXT", this.o, arrayList);
        final C6192iA1 c6192iA1 = new C6192iA1();
        Bundle bundle2 = c6192iA1.a;
        bundle2.putBundle("image", bundle);
        if (N.M6bsIDpc("ContextMenuGoogleLensChip", "enableAdditionalWebContext", false)) {
            this.l = 5;
            final WebContents webContents = this.h;
            final ?? r4 = new Callback() { // from class: Nz1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C6878kA1 c;
                    Pair pair = (Pair) obj;
                    C2206Qz1 c2206Qz1 = C2206Qz1.this;
                    WebContents webContents2 = c2206Qz1.h;
                    WebContents webContents3 = webContents;
                    ArrayList arrayList2 = arrayList;
                    if (webContents3 == webContents2) {
                        c = C2206Qz1.c(c2206Qz1.n, arrayList2, c2206Qz1.m, pair);
                    } else {
                        c = C2206Qz1.c(c2206Qz1.n, arrayList2, c2206Qz1.m, new Pair(null, null));
                    }
                    C6192iA1 c6192iA12 = c6192iA1;
                    c6192iA12.a.putBundle("web_context", c.a);
                    c2206Qz1.j(c6192iA12);
                    c2206Qz1.h(c6192iA12);
                }
            };
            if (webContents != null) {
                final ?? r0 = new Callback() { // from class: Oz1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C2206Qz1.this.d(r4, (Jl4) obj);
                    }
                };
                N.MNk21wNF("(function() {\nconst metaTags = document.getElementsByTagName('meta');\nlet output = {};for (let i = 0; i < metaTags.length; i++) {\n  if (metaTags[i].getAttribute('name') === 'description') {\n    output['description'] = metaTags[i].getAttribute('content');\n  }\n  if (metaTags[i].getAttribute('name') === 'keywords') {\n    output['keywords'] = metaTags[i].getAttribute('content');\n  }\n}\nreturn JSON.stringify(output);\n})();", new Callback() { // from class: Il4
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        JsonReader jsonReader;
                        String str = (String) obj;
                        Jl4 jl4 = new Jl4();
                        try {
                            jsonReader = new JsonReader(new StringReader(str));
                        } catch (IOException | AssertionError e) {
                            AbstractC4851eH1.a("WebContextFetcher", "Web context json was malformed: %s", e.getMessage());
                            jl4.b = e.getMessage();
                        }
                        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                            throw new AssertionError("Error reading JSON object value.");
                        }
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if (jsonReader.peek() != JsonToken.NAME) {
                                throw new AssertionError("Error reading JSON name value.");
                            }
                            String nextName = jsonReader.nextName();
                            if (jsonReader.peek() != JsonToken.STRING) {
                                throw new AssertionError("Error reading JSON string value.");
                            }
                            jl4.a.put(nextName, jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        r0.onResult(jl4);
                    }
                }, webContents.O());
                return;
            }
            d(r4, null);
            throw null;
        }
        bundle2.putBundle("web_context", c(this.n, arrayList, this.m, new Pair(null, null)).a);
        j(c6192iA1);
        h(c6192iA1);
    }

    public final void k() {
        AbstractC4851eH1.a("LensPrimeStateManagr", "Lens client disabled or connection error.", new Object[0]);
        Callback callback = this.f;
        if (callback != null) {
            callback.onResult(null);
        }
        m(this.a);
        b();
    }

    public final void j(C6192iA1 c6192iA1) {
        if (AbstractC2726Uz1.b()) {
            Bundle bundle = c6192iA1.a;
            Bundle bundle2 = (Bundle) bundle.getParcelable("web_context");
            C6878kA1 c6878kA1 = bundle2 == null ? null : new C6878kA1(bundle2);
            c6878kA1.a.putBoolean("can_translate_webpage", N.Mx5ZGJOG(this.h, false));
            c6878kA1.a.putString("original_language", N.Mkdg1mTW(this.h));
            Bundle bundle3 = new Bundle();
            bundle3.putString("current_language", N.Mijf24vV(this.h));
            bundle3.putString("target_language", N.MMKf4EpW());
            bundle.putBundle("translation_context", bundle3);
        }
    }

    public final void d(Callback callback, Jl4 jl4) {
        if (!TextUtils.isEmpty(jl4.b)) {
            m(10);
            callback.onResult(new Pair(null, null));
            return;
        }
        HashMap hashMap = jl4.a;
        if (hashMap.isEmpty()) {
            callback.onResult(new Pair(null, null));
        } else {
            callback.onResult(new Pair((String) hashMap.get("description"), (String) hashMap.get("keywords")));
        }
    }

    public static C6878kA1 c(String str, ArrayList arrayList, String str2, Pair pair) {
        C6878kA1 c6878kA1 = new C6878kA1();
        Bundle bundle = c6878kA1.a;
        if (str != null) {
            bundle.putString("current_webpage_url", str);
        }
        if (str2 != null) {
            bundle.putString("title", str2);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            C5848hA1[] c5848hA1Arr = (C5848hA1[]) arrayList.toArray(new C5848hA1[arrayList.size()]);
            int length = c5848hA1Arr.length;
            Bundle[] bundleArr = new Bundle[length];
            for (int i = 0; i < length; i++) {
                bundleArr[i] = c5848hA1Arr[i].a;
            }
            bundle.putParcelableArray("image_tag_attributes", bundleArr);
        }
        Object obj = pair.first;
        if (obj != null) {
            bundle.putString("description", (String) obj);
        }
        Object obj2 = pair.second;
        if (obj2 != null) {
            bundle.putString("keywords", (String) obj2);
        }
        return c6878kA1;
    }

    public C2206Qz1() {
        boolean z;
        C1686Mz1 c1686Mz1;
        if (AbstractC2726Uz1.a()) {
            C7928nE c7928nE = UN.a;
            z = N.M6bsIDpc("ContextMenuGoogleLensChip", "useStandaloneService", false);
        } else if (AbstractC2726Uz1.b()) {
            C7928nE c7928nE2 = UN.a;
            z = N.M6bsIDpc("ContextMenuTranslateWithGoogleLens", "useStandaloneService", false);
        } else {
            z = false;
        }
        if (z) {
            Context context = V60.a;
            int i = ServiceConnectionC4816eA1.m;
            c1686Mz1 = new C1686Mz1(new C5504gA1(new ServiceConnectionC4816eA1(context, new ExecutorC4473dA1(new Handler(Looper.getMainLooper())))), context.getPackageManager(), new C2915Wl0());
        } else {
            Context context2 = V60.a;
            c1686Mz1 = new C1686Mz1(new W7(context2), context2.getPackageManager(), new C2915Wl0());
        }
        C4502dG0 c4502dG0 = C4502dG0.b;
        this.a = 0;
        this.l = 0;
        this.b = c1686Mz1;
        this.c = c4502dG0;
        this.s = new ArrayList();
    }

    public final I44 f() {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        String b = CoreAccountInfo.b(C1202Jg1.b(d).b(1));
        I44 i44 = new I44();
        String[] split = N.M_cRNcHs().trim().split(" ", -1);
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                iArr[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException unused) {
                iArr = new int[0];
            }
        }
        Bundle bundle = i44.a;
        bundle.putIntArray("gws_experiment_ids", iArr);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_signed_in", !TextUtils.isEmpty(b));
        bundle2.putBoolean("is_incognito", this.p);
        C9626sA2.g().getClass();
        bundle2.putBoolean("is_usage_and_crash_reporting_disabled", !AbstractC1171Ja0.a(r0));
        bundle.putBundle("chrome_user_context", bundle2);
        return i44;
    }

    public static void i(String str, String str2, ArrayList arrayList) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        C5848hA1 c5848hA1 = new C5848hA1();
        Bundle bundle = c5848hA1.a;
        bundle.putString("label", str);
        bundle.putString("value", str2);
        arrayList.add(c5848hA1);
    }

    public final void a() {
        m(this.a);
        C7928nE c7928nE = UN.a;
        if (N.M37SqSAy("ContextMenuGoogleLensChip", "delaySessionCloseSecs", -1) <= 0) {
            b();
            return;
        }
        this.l = 6;
        Handler handler = new Handler();
        this.d = handler;
        handler.postDelayed(new RunnableC2076Pz1(this), r0 * 1000);
    }

    public final void b() {
        int i = this.l;
        if (i != 0 && i != 4) {
            if (i == 3) {
                AbstractC4851eH1.a("LensPrimeStateManagr", "Attempting to close connection that is still closing.", new Object[0]);
            } else {
                this.l = 3;
                Bundle bundle = new Bundle();
                C1686Mz1 c1686Mz1 = this.b;
                c1686Mz1.getClass();
                AbstractC5195fH1.a("stop", new Object[0]);
                c1686Mz1.a("Stop", bundle);
                AbstractC5195fH1.a("disconnect", new Object[0]);
                AbstractC10902vu abstractC10902vu = c1686Mz1.d;
                abstractC10902vu.b();
                abstractC10902vu.a.remove(c1686Mz1.a);
                c1686Mz1.f.l = 4;
            }
        }
        this.i = 0L;
        this.f = null;
        this.g = null;
        this.n = null;
        this.o = null;
        this.m = null;
        this.h = null;
        this.a = 0;
        this.d = null;
        this.q = null;
        this.j = null;
        this.k = null;
    }

    public final void h(C6192iA1 c6192iA1) {
        this.l = 2;
        Bundle bundle = new Bundle();
        bundle.putBundle("payload", c6192iA1.a);
        int i = this.e + 1;
        this.e = i;
        bundle.putInt("query_id", i);
        C1686Mz1 c1686Mz1 = this.b;
        c1686Mz1.getClass();
        AbstractC5195fH1.a("query", new Object[0]);
        c1686Mz1.a("Query", bundle);
    }

    public final void m(int i) {
        if (this.r) {
            C6534jA1 c6534jA1 = this.j;
            ArrayList arrayList = this.s;
            if (c6534jA1 != null && c6534jA1.a.containsKey("lens_result") && this.j.a().a.containsKey("debug_response") && this.j.a().a().length > 0) {
                for (C6368ii0 c6368ii0 : this.j.a().a()) {
                    arrayList.add(e(i, c6368ii0));
                }
            } else {
                arrayList.add(e(i, null));
            }
        }
        if (i != 0) {
            EI2.h(i, 20, "Lens.ImageClassification.ResultState");
        } else {
            AbstractC4851eH1.a("LensPrimeManagerUma", "Unknown Lens Prime result state.", new Object[0]);
        }
    }
}

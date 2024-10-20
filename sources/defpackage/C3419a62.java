package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.content_creation.notes.bridges.NoteServiceBridge;
import org.chromium.components.content_creation.notes.models.Background;
import org.chromium.components.content_creation.notes.models.NoteTemplate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a62, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3419a62 {
    public final C7616mK1 a;
    public final NoteServiceBridge b;
    public final S21 c;
    public final C4307ci1 d;

    public C3419a62(C7616mK1 c7616mK1, S21 s21, NoteServiceBridge noteServiceBridge, C4307ci1 c4307ci1) {
        this.a = c7616mK1;
        this.b = noteServiceBridge;
        this.c = s21;
        this.d = c4307ci1;
        Callback callback = new Callback() { // from class: W52
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [X52] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final List<NoteTemplate> list = (List) obj;
                final C3419a62 c3419a62 = C3419a62.this;
                c3419a62.getClass();
                ArrayList arrayList = new ArrayList();
                for (NoteTemplate noteTemplate : list) {
                    arrayList.add(noteTemplate.c);
                    Background background = noteTemplate.f;
                    if (background != null) {
                        arrayList.add(background);
                    }
                }
                final ?? r2 = new Runnable() { // from class: X52
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3419a62 c3419a622 = C3419a62.this;
                        c3419a622.getClass();
                        List list2 = list;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            NoteTemplate noteTemplate2 = (NoteTemplate) it.next();
                            Background background2 = noteTemplate2.c;
                            if (background2 instanceof C1591Mg1) {
                                if (((C1591Mg1) background2).b == null) {
                                    it.remove();
                                }
                            }
                            Background background3 = noteTemplate2.f;
                            if (background3 instanceof C1591Mg1) {
                                if (((C1591Mg1) background3).b == null) {
                                    it.remove();
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new Z52((NoteTemplate) it2.next()));
                        }
                        HashSet hashSet = new HashSet();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            hashSet.add(((Z52) it3.next()).b);
                        }
                        Y52 y52 = new Y52(c3419a622, arrayList2);
                        S21 s212 = c3419a622.c;
                        s212.getClass();
                        if (hashSet.isEmpty()) {
                            return;
                        }
                        HandlerThread handlerThread = new HandlerThread("GoogleFontHandlerThread");
                        handlerThread.start();
                        HashMap hashMap = new HashMap();
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            IZ3 iz3 = (IZ3) it4.next();
                            LR0 lr0 = new LR0(R.array.f2080_resource_name_obfuscated_res_0x7f040077, iz3.a());
                            R21 r21 = new R21(s212, hashMap, iz3, hashSet, y52, handlerThread);
                            Handler handler = new Handler(handlerThread.getLooper());
                            YR0.b(s212.a.getApplicationContext(), lr0, 0, new RN2(handler), new C8963qF(r21));
                        }
                    }
                };
                C4307ci1 c4307ci12 = c3419a62.d;
                c4307ci12.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Background background2 = (Background) it.next();
                    if (background2 instanceof C1591Mg1) {
                        hashSet.add((C1591Mg1) background2);
                    }
                }
                if (hashSet.isEmpty()) {
                    r2.run();
                    return;
                }
                final C3964bi1 c3964bi1 = new C3964bi1(hashSet.size());
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    final C1591Mg1 c1591Mg1 = (C1591Mg1) it2.next();
                    c4307ci12.a.d(C0037Ah1.b(c1591Mg1.a, "WebNotes"), new Callback() { // from class: ai1
                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            C1591Mg1.this.b = (Bitmap) obj2;
                            C3964bi1 c3964bi12 = c3964bi1;
                            int i = c3964bi12.a - 1;
                            c3964bi12.a = i;
                            if (i == 0) {
                                r2.run();
                            }
                        }

                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }
                    });
                }
            }
        };
        long j = noteServiceBridge.a;
        if (j == 0) {
            return;
        }
        N.M9J_OLxe(j, noteServiceBridge, callback);
    }
}

package com.google.vr.sdk.proto.nano;

import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Preferences$UserPrefs extends RF0 implements Cloneable {
    private int bitField0_;
    private int controllerHandedness_;
    public Preferences$DeveloperPrefs developerPrefs;

    public static int checkHandednessOrThrow(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append(i);
        sb.append(" is not a valid enum Handedness");
        throw new IllegalArgumentException(sb.toString());
    }

    public Preferences$UserPrefs() {
        clear();
    }

    public final Preferences$UserPrefs clear() {
        this.bitField0_ = 0;
        this.controllerHandedness_ = 0;
        this.developerPrefs = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Preferences$UserPrefs clone() {
        try {
            Preferences$UserPrefs preferences$UserPrefs = (Preferences$UserPrefs) a();
            Preferences$DeveloperPrefs preferences$DeveloperPrefs = this.developerPrefs;
            if (preferences$DeveloperPrefs != null) {
                preferences$UserPrefs.developerPrefs = preferences$DeveloperPrefs.clone();
            }
            return preferences$UserPrefs;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.r(1, this.controllerHandedness_);
        }
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = this.developerPrefs;
        if (preferences$DeveloperPrefs != null) {
            gv.t(2, preferences$DeveloperPrefs);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.d(1, this.controllerHandedness_);
        }
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = this.developerPrefs;
        return preferences$DeveloperPrefs != null ? computeSerializedSize + GV.f(2, preferences$DeveloperPrefs) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Preferences$UserPrefs mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            if (m == 8) {
                this.bitField0_ |= 1;
                int i = c12129zV.e - c12129zV.b;
                try {
                    this.controllerHandedness_ = checkHandednessOrThrow(c12129zV.j());
                    this.bitField0_ |= 1;
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                if (this.developerPrefs == null) {
                    this.developerPrefs = new Preferences$DeveloperPrefs();
                }
                c12129zV.f(this.developerPrefs);
            }
        }
    }
}

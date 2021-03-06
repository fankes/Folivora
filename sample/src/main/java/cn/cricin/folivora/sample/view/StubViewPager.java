/*
 * Copyright (C) 2019 Cricin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.cricin.folivora.sample.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import cn.cricin.folivora.Folivora;
import cn.cricin.folivora.ReplacedBySuper;

/**
 * ViewPager is not capable with Folivora at design time, so we stubbed it
 * to make Folivora get worked with ViewPager.
 */
@SuppressWarnings("unused")
public class StubViewPager extends ViewPager implements ReplacedBySuper {
  public StubViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    if (!isInEditMode()) {
      throw new IllegalStateException("StubViewPager only available at design time");
    }
    Folivora.applyDrawableToView(this, attrs);
  }
}

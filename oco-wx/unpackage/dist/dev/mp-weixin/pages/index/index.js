"use strict";
const common_vendor = require("../../common/vendor.js");
const _sfc_main = {
  data() {
    return {
      title: "Hello"
    };
  },
  onLoad() {
  },
  methods: {}
};
function _sfc_render(_ctx, _cache, $props, $setup, $data, $options) {
  return {
    a: common_vendor.t($data.title)
  };
}
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["render", _sfc_render], ["__file", "/Users/dingmengdi/Developer/code/applet/learn/\u5728\u7EBF\u534F\u540C\u529E\u516C\u5C0F\u7A0B\u5E8F\u5F00\u53D1 \u5168\u6808\u5F0F\u9879\u76EE\u5B9E\u6218/oco/oco-wx/pages/index/index.vue"]]);
wx.createPage(MiniProgramPage);
